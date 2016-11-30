package com.xten.netty.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/7/27
 * Time: 上午11:40
 * To change this template use File | Settings | File Templates.
 */
public class TimeClientHandler extends SimpleChannelInboundHandler<Object> {

    public static final  Logger logger= Logger.getLogger(TimeClientHandler.class.getName());

    private final ByteBuf firstMessage;

    public TimeClientHandler(){
        byte[] req="QUERY TIME ORDER".getBytes();
        firstMessage= Unpooled.buffer(req.length);
        firstMessage.writeBytes(req);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object message) throws Exception {
        ByteBuf buf =(ByteBuf) message;
        byte[] req=new byte[buf.readableBytes()];
        buf.readBytes(req);
        String bordy=new String(req,"UTF-8");
        System.out.println("now is : "+bordy);

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(firstMessage);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

}

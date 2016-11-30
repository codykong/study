package com.xten.netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/7/27
 * Time: 上午10:36
 * To change this template use File | Settings | File Templates.
 */
public class TimeServerHandler extends SimpleChannelInboundHandler<Object> {



    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object message) throws Exception {
        ByteBuf buf =(ByteBuf) message;
        byte[] req=new byte[buf.readableBytes()];
        buf.readBytes(req);
        String bordy=new String(req,"UTF-8");
        System.out.println("The time server receive order : "+bordy);
        String currentTime="QUERY TIME ORDER".equalsIgnoreCase(bordy)? new Date(System.currentTimeMillis()).toString():"BAD ORDER";

        ByteBuf resp= Unpooled.copiedBuffer(currentTime.getBytes());
        ctx.write(resp);

    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}

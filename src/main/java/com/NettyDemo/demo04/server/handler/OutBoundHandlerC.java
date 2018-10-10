package com.NettyDemo.demo04.server.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

/**
 * @Author: ZiJie.Yip
 * @Description:OutBoundHandlerC
 * @date: 2018/10/10 11:51
 */
public class OutBoundHandlerC extends ChannelOutboundHandlerAdapter {

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        System.out.println("OutBoundHandlerC: "+msg);
        super.write(ctx, msg, promise);
    }
}

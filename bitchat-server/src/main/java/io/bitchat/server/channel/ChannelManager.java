package io.bitchat.server.channel;

import io.netty.channel.Channel;
import io.netty.channel.ChannelId;

/**
 * @author houyi
 */
public interface ChannelManager {

    /**
     * add the Channel when
     * {@link io.bitchat.server.ws.FrameHandler#channelActive(io.netty.channel.ChannelHandlerContext)}
     * is triggered
     */
    void addChannel(Channel channel);

    /**
     * remove the Channel when
     * {@link io.bitchat.server.ws.FrameHandler#channelInactive(io.netty.channel.ChannelHandlerContext)}
     * is triggered
     */
    void removeChannel(ChannelId id);

    Channel getChannel(ChannelId id);

}

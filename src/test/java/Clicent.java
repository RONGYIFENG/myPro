import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.ReferenceCountUtil;

import java.nio.ByteBuffer;

public class Clicent extends ChannelHandlerAdapter {

    public void channelRead(ChannelHandlerContext context,Object msg){
    try{
        ByteBuf in=(ByteBuf)msg;
        while (in.isReadable()){
        System.err.println(in.readByte());
        }
    }catch (Exception e){
        ReferenceCountUtil.release(msg);
    }

    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}

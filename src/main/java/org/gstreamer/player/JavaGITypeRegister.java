package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(Player.getType(), Player.fromAddress);
        Interop.typeRegister.put(PlayerAudioInfo.getType(), PlayerAudioInfo.fromAddress);
        Interop.typeRegister.put(PlayerGMainContextSignalDispatcher.getType(), PlayerGMainContextSignalDispatcher.fromAddress);
        Interop.typeRegister.put(PlayerMediaInfo.getType(), PlayerMediaInfo.fromAddress);
        Interop.typeRegister.put(PlayerStreamInfo.getType(), PlayerStreamInfo.fromAddress);
        Interop.typeRegister.put(PlayerSubtitleInfo.getType(), PlayerSubtitleInfo.fromAddress);
        Interop.typeRegister.put(PlayerVideoInfo.getType(), PlayerVideoInfo.fromAddress);
        Interop.typeRegister.put(PlayerVideoOverlayVideoRenderer.getType(), PlayerVideoOverlayVideoRenderer.fromAddress);
        Interop.typeRegister.put(PlayerSignalDispatcher.getType(), PlayerSignalDispatcher.fromAddress);
        Interop.typeRegister.put(PlayerVideoRenderer.getType(), PlayerVideoRenderer.fromAddress);
    }
}

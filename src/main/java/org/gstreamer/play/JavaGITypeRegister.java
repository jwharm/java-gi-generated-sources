package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(Play.getType(), Play.fromAddress);
        Interop.typeRegister.put(PlayAudioInfo.getType(), PlayAudioInfo.fromAddress);
        Interop.typeRegister.put(PlayMediaInfo.getType(), PlayMediaInfo.fromAddress);
        Interop.typeRegister.put(PlaySignalAdapter.getType(), PlaySignalAdapter.fromAddress);
        Interop.typeRegister.put(PlayStreamInfo.getType(), PlayStreamInfo.fromAddress);
        Interop.typeRegister.put(PlaySubtitleInfo.getType(), PlaySubtitleInfo.fromAddress);
        Interop.typeRegister.put(PlayVideoInfo.getType(), PlayVideoInfo.fromAddress);
        Interop.typeRegister.put(PlayVideoOverlayVideoRenderer.getType(), PlayVideoOverlayVideoRenderer.fromAddress);
        Interop.typeRegister.put(PlayVideoRenderer.getType(), PlayVideoRenderer.fromAddress);
    }
}

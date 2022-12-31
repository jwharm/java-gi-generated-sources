package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(AudioVisualizer.getType(), AudioVisualizer.fromAddress);
        Interop.typeRegister.put(Discoverer.getType(), Discoverer.fromAddress);
        Interop.typeRegister.put(DiscovererAudioInfo.getType(), DiscovererAudioInfo.fromAddress);
        Interop.typeRegister.put(DiscovererContainerInfo.getType(), DiscovererContainerInfo.fromAddress);
        Interop.typeRegister.put(DiscovererInfo.getType(), DiscovererInfo.fromAddress);
        Interop.typeRegister.put(DiscovererStreamInfo.getType(), DiscovererStreamInfo.fromAddress);
        Interop.typeRegister.put(DiscovererSubtitleInfo.getType(), DiscovererSubtitleInfo.fromAddress);
        Interop.typeRegister.put(DiscovererVideoInfo.getType(), DiscovererVideoInfo.fromAddress);
        Interop.typeRegister.put(EncodingAudioProfile.getType(), EncodingAudioProfile.fromAddress);
        Interop.typeRegister.put(EncodingContainerProfile.getType(), EncodingContainerProfile.fromAddress);
        Interop.typeRegister.put(EncodingProfile.getType(), EncodingProfile.fromAddress);
        Interop.typeRegister.put(EncodingTarget.getType(), EncodingTarget.fromAddress);
        Interop.typeRegister.put(EncodingVideoProfile.getType(), EncodingVideoProfile.fromAddress);
    }
}

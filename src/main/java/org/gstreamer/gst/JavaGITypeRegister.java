package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(Allocator.getType(), Allocator.fromAddress);
        Interop.typeRegister.put(Bin.getType(), Bin.fromAddress);
        Interop.typeRegister.put(Bitmask.getType(), Bitmask.fromAddress);
        Interop.typeRegister.put(BufferPool.getType(), BufferPool.fromAddress);
        Interop.typeRegister.put(Bus.getType(), Bus.fromAddress);
        Interop.typeRegister.put(Clock.getType(), Clock.fromAddress);
        Interop.typeRegister.put(ControlBinding.getType(), ControlBinding.fromAddress);
        Interop.typeRegister.put(ControlSource.getType(), ControlSource.fromAddress);
        Interop.typeRegister.put(Device.getType(), Device.fromAddress);
        Interop.typeRegister.put(DeviceMonitor.getType(), DeviceMonitor.fromAddress);
        Interop.typeRegister.put(DeviceProvider.getType(), DeviceProvider.fromAddress);
        Interop.typeRegister.put(DeviceProviderFactory.getType(), DeviceProviderFactory.fromAddress);
        Interop.typeRegister.put(DoubleRange.getType(), DoubleRange.fromAddress);
        Interop.typeRegister.put(DynamicTypeFactory.getType(), DynamicTypeFactory.fromAddress);
        Interop.typeRegister.put(Element.getType(), Element.fromAddress);
        Interop.typeRegister.put(ElementFactory.getType(), ElementFactory.fromAddress);
        Interop.typeRegister.put(FlagSet.getType(), FlagSet.fromAddress);
        Interop.typeRegister.put(Fraction.getType(), Fraction.fromAddress);
        Interop.typeRegister.put(FractionRange.getType(), FractionRange.fromAddress);
        Interop.typeRegister.put(GhostPad.getType(), GhostPad.fromAddress);
        Interop.typeRegister.put(Int64Range.getType(), Int64Range.fromAddress);
        Interop.typeRegister.put(IntRange.getType(), IntRange.fromAddress);
        Interop.typeRegister.put(GstObject.getType(), GstObject.fromAddress);
        Interop.typeRegister.put(Pad.getType(), Pad.fromAddress);
        Interop.typeRegister.put(PadTemplate.getType(), PadTemplate.fromAddress);
        Interop.typeRegister.put(ParamArray.getType(), ParamArray.fromAddress);
        Interop.typeRegister.put(ParamFraction.getType(), ParamFraction.fromAddress);
        Interop.typeRegister.put(Pipeline.getType(), Pipeline.fromAddress);
        Interop.typeRegister.put(Plugin.getType(), Plugin.fromAddress);
        Interop.typeRegister.put(PluginFeature.getType(), PluginFeature.fromAddress);
        Interop.typeRegister.put(ProxyPad.getType(), ProxyPad.fromAddress);
        Interop.typeRegister.put(Registry.getType(), Registry.fromAddress);
        Interop.typeRegister.put(SharedTaskPool.getType(), SharedTaskPool.fromAddress);
        Interop.typeRegister.put(Stream.getType(), Stream.fromAddress);
        Interop.typeRegister.put(StreamCollection.getType(), StreamCollection.fromAddress);
        Interop.typeRegister.put(SystemClock.getType(), SystemClock.fromAddress);
        Interop.typeRegister.put(Task.getType(), Task.fromAddress);
        Interop.typeRegister.put(TaskPool.getType(), TaskPool.fromAddress);
        Interop.typeRegister.put(Tracer.getType(), Tracer.fromAddress);
        Interop.typeRegister.put(TracerFactory.getType(), TracerFactory.fromAddress);
        Interop.typeRegister.put(TracerRecord.getType(), TracerRecord.fromAddress);
        Interop.typeRegister.put(TypeFindFactory.getType(), TypeFindFactory.fromAddress);
        Interop.typeRegister.put(ValueArray.getType(), ValueArray.fromAddress);
        Interop.typeRegister.put(ValueList.getType(), ValueList.fromAddress);
        Interop.typeRegister.put(ChildProxy.getType(), ChildProxy.fromAddress);
        Interop.typeRegister.put(Preset.getType(), Preset.fromAddress);
        Interop.typeRegister.put(TagSetter.getType(), TagSetter.fromAddress);
        Interop.typeRegister.put(TocSetter.getType(), TocSetter.fromAddress);
        Interop.typeRegister.put(URIHandler.getType(), URIHandler.fromAddress);
    }
}

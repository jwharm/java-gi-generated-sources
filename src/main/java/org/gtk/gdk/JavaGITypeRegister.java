package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(AppLaunchContext.getType(), AppLaunchContext.fromAddress);
        Interop.typeRegister.put(ButtonEvent.getType(), ButtonEvent.fromAddress);
        Interop.typeRegister.put(CairoContext.getType(), CairoContext.fromAddress);
        Interop.typeRegister.put(Clipboard.getType(), Clipboard.fromAddress);
        Interop.typeRegister.put(ContentDeserializer.getType(), ContentDeserializer.fromAddress);
        Interop.typeRegister.put(ContentProvider.getType(), ContentProvider.fromAddress);
        Interop.typeRegister.put(ContentSerializer.getType(), ContentSerializer.fromAddress);
        Interop.typeRegister.put(CrossingEvent.getType(), CrossingEvent.fromAddress);
        Interop.typeRegister.put(Cursor.getType(), Cursor.fromAddress);
        Interop.typeRegister.put(DNDEvent.getType(), DNDEvent.fromAddress);
        Interop.typeRegister.put(DeleteEvent.getType(), DeleteEvent.fromAddress);
        Interop.typeRegister.put(Device.getType(), Device.fromAddress);
        Interop.typeRegister.put(DeviceTool.getType(), DeviceTool.fromAddress);
        Interop.typeRegister.put(Display.getType(), Display.fromAddress);
        Interop.typeRegister.put(DisplayManager.getType(), DisplayManager.fromAddress);
        Interop.typeRegister.put(Drag.getType(), Drag.fromAddress);
        Interop.typeRegister.put(DrawContext.getType(), DrawContext.fromAddress);
        Interop.typeRegister.put(Drop.getType(), Drop.fromAddress);
        Interop.typeRegister.put(Event.getType(), Event.fromAddress);
        Interop.typeRegister.put(FocusEvent.getType(), FocusEvent.fromAddress);
        Interop.typeRegister.put(FrameClock.getType(), FrameClock.fromAddress);
        Interop.typeRegister.put(GLContext.getType(), GLContext.fromAddress);
        Interop.typeRegister.put(GLTexture.getType(), GLTexture.fromAddress);
        Interop.typeRegister.put(GrabBrokenEvent.getType(), GrabBrokenEvent.fromAddress);
        Interop.typeRegister.put(KeyEvent.getType(), KeyEvent.fromAddress);
        Interop.typeRegister.put(MemoryTexture.getType(), MemoryTexture.fromAddress);
        Interop.typeRegister.put(Monitor.getType(), Monitor.fromAddress);
        Interop.typeRegister.put(MotionEvent.getType(), MotionEvent.fromAddress);
        Interop.typeRegister.put(PadEvent.getType(), PadEvent.fromAddress);
        Interop.typeRegister.put(ProximityEvent.getType(), ProximityEvent.fromAddress);
        Interop.typeRegister.put(ScrollEvent.getType(), ScrollEvent.fromAddress);
        Interop.typeRegister.put(Seat.getType(), Seat.fromAddress);
        Interop.typeRegister.put(Snapshot.getType(), Snapshot.fromAddress);
        Interop.typeRegister.put(Surface.getType(), Surface.fromAddress);
        Interop.typeRegister.put(Texture.getType(), Texture.fromAddress);
        Interop.typeRegister.put(TouchEvent.getType(), TouchEvent.fromAddress);
        Interop.typeRegister.put(TouchpadEvent.getType(), TouchpadEvent.fromAddress);
        Interop.typeRegister.put(VulkanContext.getType(), VulkanContext.fromAddress);
        Interop.typeRegister.put(DevicePad.getType(), DevicePad.fromAddress);
        Interop.typeRegister.put(DragSurface.getType(), DragSurface.fromAddress);
        Interop.typeRegister.put(Paintable.getType(), Paintable.fromAddress);
        Interop.typeRegister.put(Popup.getType(), Popup.fromAddress);
        Interop.typeRegister.put(Toplevel.getType(), Toplevel.fromAddress);
    }
}

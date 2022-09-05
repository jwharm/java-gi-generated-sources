package org.gtk.gdk;

import jdk.incubator.foreign.*;
import java.util.HashMap;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static final HashMap<java.lang.Integer, java.lang.Object> signalRegistry = new HashMap<>();
    
    public static void signalSeatDeviceAdded(MemoryAddress source, MemoryAddress device, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Seat.DeviceAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Seat(ProxyFactory.getCachedProxy(source)), new Device(ProxyFactory.getProxy(device, false)));
    }
    
    public static void signalSeatDeviceRemoved(MemoryAddress source, MemoryAddress device, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Seat.DeviceRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Seat(ProxyFactory.getCachedProxy(source)), new Device(ProxyFactory.getProxy(device, false)));
    }
    
    public static void signalSeatToolAdded(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Seat.ToolAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Seat(ProxyFactory.getCachedProxy(source)), new DeviceTool(ProxyFactory.getProxy(tool, false)));
    }
    
    public static void signalSeatToolRemoved(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Seat.ToolRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Seat(ProxyFactory.getCachedProxy(source)), new DeviceTool(ProxyFactory.getProxy(tool, false)));
    }
    
    public static void signalContentProviderContentChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ContentProvider.ContentChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ContentProvider(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalSurfaceEnterMonitor(MemoryAddress source, MemoryAddress monitor, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Surface.EnterMonitorHandler) signalRegistry.get(hash);
        handler.signalReceived(new Surface(ProxyFactory.getCachedProxy(source)), new Monitor(ProxyFactory.getProxy(monitor, false)));
    }
    
    public static boolean signalSurfaceEvent(MemoryAddress source, MemoryAddress event, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Surface.EventHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Surface(ProxyFactory.getCachedProxy(source)), new Event(ProxyFactory.getProxy(event, false)));
    }
    
    public static void signalSurfaceLayout(MemoryAddress source, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Surface.LayoutHandler) signalRegistry.get(hash);
        handler.signalReceived(new Surface(ProxyFactory.getCachedProxy(source)), width, height);
    }
    
    public static void signalSurfaceLeaveMonitor(MemoryAddress source, MemoryAddress monitor, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Surface.LeaveMonitorHandler) signalRegistry.get(hash);
        handler.signalReceived(new Surface(ProxyFactory.getCachedProxy(source)), new Monitor(ProxyFactory.getProxy(monitor, false)));
    }
    
    public static boolean signalSurfaceRender(MemoryAddress source, MemoryAddress region, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Surface.RenderHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Surface(ProxyFactory.getCachedProxy(source)), new org.cairographics.Region(ProxyFactory.getProxy(region, false)));
    }
    
    public static void signalDragCancel(MemoryAddress source, int reason, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drag.CancelHandler) signalRegistry.get(hash);
        handler.signalReceived(new Drag(ProxyFactory.getCachedProxy(source)), DragCancelReason.fromValue(reason));
    }
    
    public static void signalDragDndFinished(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drag.DndFinishedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Drag(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalDragDropPerformed(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drag.DropPerformedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Drag(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalDisplayManagerDisplayOpened(MemoryAddress source, MemoryAddress display, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DisplayManager.DisplayOpenedHandler) signalRegistry.get(hash);
        handler.signalReceived(new DisplayManager(ProxyFactory.getCachedProxy(source)), new Display(ProxyFactory.getProxy(display, false)));
    }
    
    public static void signalClipboardChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Clipboard.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Clipboard(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalDisplayClosed(MemoryAddress source, boolean isError, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Display.ClosedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Display(ProxyFactory.getCachedProxy(source)), isError);
    }
    
    public static void signalDisplayOpened(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Display.OpenedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Display(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalDisplaySeatAdded(MemoryAddress source, MemoryAddress seat, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Display.SeatAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Display(ProxyFactory.getCachedProxy(source)), new Seat(ProxyFactory.getProxy(seat, false)));
    }
    
    public static void signalDisplaySeatRemoved(MemoryAddress source, MemoryAddress seat, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Display.SeatRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Display(ProxyFactory.getCachedProxy(source)), new Seat(ProxyFactory.getProxy(seat, false)));
    }
    
    public static void signalDisplaySettingChanged(MemoryAddress source, MemoryAddress setting, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Display.SettingChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Display(ProxyFactory.getCachedProxy(source)), setting.getUtf8String(0));
    }
    
    public static void signalToplevelComputeSize(MemoryAddress source, MemoryAddress size, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Toplevel.ComputeSizeHandler) signalRegistry.get(hash);
        handler.signalReceived(new Toplevel.ToplevelImpl(ProxyFactory.getCachedProxy(source)), new ToplevelSize(ProxyFactory.getProxy(size, false)));
    }
    
    public static void signalDeviceChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Device.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Device(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalDeviceToolChanged(MemoryAddress source, MemoryAddress tool, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Device.ToolChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Device(ProxyFactory.getCachedProxy(source)), new DeviceTool(ProxyFactory.getProxy(tool, false)));
    }
    
    public static void signalMonitorInvalidate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Monitor.InvalidateHandler) signalRegistry.get(hash);
        handler.signalReceived(new Monitor(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalFrameClockAfterPaint(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FrameClock.AfterPaintHandler) signalRegistry.get(hash);
        handler.signalReceived(new FrameClock(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalFrameClockBeforePaint(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FrameClock.BeforePaintHandler) signalRegistry.get(hash);
        handler.signalReceived(new FrameClock(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalFrameClockFlushEvents(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FrameClock.FlushEventsHandler) signalRegistry.get(hash);
        handler.signalReceived(new FrameClock(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalFrameClockLayout(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FrameClock.LayoutHandler) signalRegistry.get(hash);
        handler.signalReceived(new FrameClock(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalFrameClockPaint(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FrameClock.PaintHandler) signalRegistry.get(hash);
        handler.signalReceived(new FrameClock(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalFrameClockResumeEvents(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FrameClock.ResumeEventsHandler) signalRegistry.get(hash);
        handler.signalReceived(new FrameClock(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalFrameClockUpdate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FrameClock.UpdateHandler) signalRegistry.get(hash);
        handler.signalReceived(new FrameClock(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalVulkanContextImagesUpdated(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VulkanContext.ImagesUpdatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new VulkanContext(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalPaintableInvalidateContents(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paintable.InvalidateContentsHandler) signalRegistry.get(hash);
        handler.signalReceived(new Paintable.PaintableImpl(ProxyFactory.getCachedProxy(source)));
    }
    
    public static void signalPaintableInvalidateSize(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paintable.InvalidateSizeHandler) signalRegistry.get(hash);
        handler.signalReceived(new Paintable.PaintableImpl(ProxyFactory.getCachedProxy(source)));
    }
    
}

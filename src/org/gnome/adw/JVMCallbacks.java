package org.gnome.adw;

import java.lang.foreign.*;
import io.github.jwharm.javagi.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static boolean signalTabViewClosePage(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TabView.ClosePageHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TabView(References.get(source)), new TabPage(References.get(page, false)));
    }
    
    public static void signalTabViewCreateWindow(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TabView.CreateWindowHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TabView(References.get(source)));
    }
    
    public static void signalTabViewIndicatorActivated(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TabView.IndicatorActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TabView(References.get(source)), new TabPage(References.get(page, false)));
    }
    
    public static void signalTabViewPageAttached(MemoryAddress source, MemoryAddress page, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TabView.PageAttachedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TabView(References.get(source)), new TabPage(References.get(page, false)), position);
    }
    
    public static void signalTabViewPageDetached(MemoryAddress source, MemoryAddress page, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TabView.PageDetachedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TabView(References.get(source)), new TabPage(References.get(page, false)), position);
    }
    
    public static void signalTabViewPageReordered(MemoryAddress source, MemoryAddress page, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TabView.PageReorderedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TabView(References.get(source)), new TabPage(References.get(page, false)), position);
    }
    
    public static void signalTabViewSetupMenu(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TabView.SetupMenuHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TabView(References.get(source)), new TabPage(References.get(page, false)));
    }
    
    public static void cbAnimationTargetFunc(double value, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (AnimationTargetFunc) Interop.signalRegistry.get(hash);
        handler.onAnimationTargetFunc(value);
    }
    
    public static void signalAnimationDone(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Animation.DoneHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Animation(References.get(source)));
    }
    
    public static boolean signalTabBarExtraDragDrop(MemoryAddress source, MemoryAddress page, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TabBar.ExtraDragDropHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TabBar(References.get(source)), new TabPage(References.get(page, false)), new org.gtk.gobject.Value(References.get(value, false)));
    }
    
    public static void signalCarouselPageChanged(MemoryAddress source, int index, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Carousel.PageChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Carousel(References.get(source)), index);
    }
    
    public static void signalToastDismissed(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Toast.DismissedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Toast(References.get(source)));
    }
    
    public static void signalSplitButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SplitButton.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SplitButton(References.get(source)));
    }
    
    public static void signalSplitButtonClicked(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SplitButton.ClickedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SplitButton(References.get(source)));
    }
    
    public static void signalSwipeTrackerBeginSwipe(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SwipeTracker.BeginSwipeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SwipeTracker(References.get(source)));
    }
    
    public static void signalSwipeTrackerEndSwipe(MemoryAddress source, double velocity, double to, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SwipeTracker.EndSwipeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SwipeTracker(References.get(source)), velocity, to);
    }
    
    public static void signalSwipeTrackerPrepare(MemoryAddress source, int direction, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SwipeTracker.PrepareHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SwipeTracker(References.get(source)), NavigationDirection.fromValue(direction));
    }
    
    public static void signalSwipeTrackerUpdateSwipe(MemoryAddress source, double progress, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SwipeTracker.UpdateSwipeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SwipeTracker(References.get(source)), progress);
    }
    
    public static void signalActionRowActivated(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionRow.ActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ActionRow(References.get(source)));
    }
    
}

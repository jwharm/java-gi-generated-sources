package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Adw namespace.
 */
public final class Adw {
    
    static {
        LibLoad.loadLibrary("adwaita-1");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
/**
 * Indicates an {@link Animation} with an infinite duration.
 * <p>
 * This value is mostly used internally.
 */
public static final int DURATION_INFINITE = -1;
    
/**
 * Adwaita major version component (e.g. 1 if the version is 1.2.3).
 */
public static final int MAJOR_VERSION = 1;
    
/**
 * Adwaita micro version component (e.g. 3 if the version is 1.2.3).
 */
public static final int MICRO_VERSION = 0;
    
/**
 * Adwaita minor version component (e.g. 2 if the version is 1.2.3).
 */
public static final int MINOR_VERSION = 2;
    
/**
 * Adwaita version, encoded as a string, useful for printing and
 * concatenation.
 */
public static final java.lang.String VERSION_S = "1.2.0";

/**
 * Computes easing with {@code easing} for {@code value}.
 * <p>
 * {@code value} should generally be in the [0, 1] range.
 * @param self an easing value
 * @param value a value to ease
 * @return the easing for {@code value}
 */
public static double easingEase(org.gnome.adw.Easing self, double value) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.adw_easing_ease.invokeExact(
                self.getValue(),
                value);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Checks whether animations are enabled for {@code widget}.
 * <p>
 * This should be used when implementing an animated widget to know whether to
 * animate it or not.
 * @param widget a {@code GtkWidget}
 * @return whether animations are enabled for {@code widget}
 */
public static boolean getEnableAnimations(org.gtk.gtk.Widget widget) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.adw_get_enable_animations.invokeExact(widget.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Returns the major version number of the Adwaita library.
 * <p>
 * For example, in libadwaita version 1.2.3 this is 1.
 * <p>
 * This function is in the library, so it represents the libadwaita library your
 * code is running against. Contrast with the {@code MAJOR_VERSION} constant,
 * which represents the major version of the libadwaita headers you have
 * included when compiling your code.
 * @return the major version number of the Adwaita library
 */
public static int getMajorVersion() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.adw_get_major_version.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns the micro version number of the Adwaita library.
 * <p>
 * For example, in libadwaita version 1.2.3 this is 3.
 * <p>
 * This function is in the library, so it represents the libadwaita library your
 * code is running against. Contrast with the {@code MAJOR_VERSION} constant,
 * which represents the micro version of the libadwaita headers you have
 * included when compiling your code.
 * @return the micro version number of the Adwaita library
 */
public static int getMicroVersion() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.adw_get_micro_version.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Returns the minor version number of the Adwaita library.
 * <p>
 * For example, in libadwaita version 1.2.3 this is 2.
 * <p>
 * This function is in the library, so it represents the libadwaita library your
 * code is running against. Contrast with the {@code MAJOR_VERSION} constant,
 * which represents the minor version of the libadwaita headers you have
 * included when compiling your code.
 * @return the minor version number of the Adwaita library
 */
public static int getMinorVersion() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.adw_get_minor_version.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Initializes Libadwaita.
 * <p>
 * This function can be used instead of {@link org.gtk.gtk.Gtk#init} as it initializes GTK
 * implicitly.
 * <p>
 * There's no need to call this function if you're using {@link Application}.
 * <p>
 * If Libadwaita has already been initialized, the function will simply return.
 * <p>
 * This makes sure translations, types, themes, and icons for the Adwaita
 * library are set up properly.
 */
public static void init() {
    try {
        DowncallHandles.adw_init.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Use this function to check if libadwaita has been initialized with
 * {@link Adw#init}.
 * @return the initialization status
 */
public static boolean isInitialized() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.adw_is_initialized.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Computes the linear interpolation between {@code a} and {@code b} for {@code t}.
 * @param a the start
 * @param b the end
 * @param t the interpolation rate
 * @return the computed value
 */
public static double lerp(double a, double b, double t) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.adw_lerp.invokeExact(
                a,
                b,
                t);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * A convenience function for showing an application’s about window.
 * @param parent the parent top-level window
 * @param firstPropertyName the name of the first property
 * @param varargs value of first property, followed by more pairs of property name and
 *   value, {@code NULL}-terminated
 */
public static void showAboutWindow(@Nullable org.gtk.gtk.Window parent, java.lang.String firstPropertyName, java.lang.Object... varargs) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.adw_show_about_window.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    Marshal.stringToAddress.marshal(firstPropertyName, SCOPE),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}
    
    private static class DowncallHandles {

private static final MethodHandle adw_easing_ease = Interop.downcallHandle(
        "adw_easing_ease",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle adw_get_enable_animations = Interop.downcallHandle(
        "adw_get_enable_animations",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle adw_get_major_version = Interop.downcallHandle(
        "adw_get_major_version",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle adw_get_micro_version = Interop.downcallHandle(
        "adw_get_micro_version",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle adw_get_minor_version = Interop.downcallHandle(
        "adw_get_minor_version",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle adw_init = Interop.downcallHandle(
        "adw_init",
        FunctionDescriptor.ofVoid(),
        false
);

private static final MethodHandle adw_is_initialized = Interop.downcallHandle(
        "adw_is_initialized",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle adw_lerp = Interop.downcallHandle(
        "adw_lerp",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle adw_show_about_window = Interop.downcallHandle(
        "adw_show_about_window",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        true
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (AboutWindow.isAvailable()) Interop.register(AboutWindow.getType(), AboutWindow.fromAddress);
        if (ActionRow.isAvailable()) Interop.register(ActionRow.getType(), ActionRow.fromAddress);
        if (Animation.isAvailable()) Interop.register(Animation.getType(), Animation.fromAddress);
        if (AnimationTarget.isAvailable()) Interop.register(AnimationTarget.getType(), AnimationTarget.fromAddress);
        if (Application.isAvailable()) Interop.register(Application.getType(), Application.fromAddress);
        if (ApplicationWindow.isAvailable()) Interop.register(ApplicationWindow.getType(), ApplicationWindow.fromAddress);
        if (Avatar.isAvailable()) Interop.register(Avatar.getType(), Avatar.fromAddress);
        if (Bin.isAvailable()) Interop.register(Bin.getType(), Bin.fromAddress);
        if (ButtonContent.isAvailable()) Interop.register(ButtonContent.getType(), ButtonContent.fromAddress);
        if (CallbackAnimationTarget.isAvailable()) Interop.register(CallbackAnimationTarget.getType(), CallbackAnimationTarget.fromAddress);
        if (Carousel.isAvailable()) Interop.register(Carousel.getType(), Carousel.fromAddress);
        if (CarouselIndicatorDots.isAvailable()) Interop.register(CarouselIndicatorDots.getType(), CarouselIndicatorDots.fromAddress);
        if (CarouselIndicatorLines.isAvailable()) Interop.register(CarouselIndicatorLines.getType(), CarouselIndicatorLines.fromAddress);
        if (Clamp.isAvailable()) Interop.register(Clamp.getType(), Clamp.fromAddress);
        if (ClampLayout.isAvailable()) Interop.register(ClampLayout.getType(), ClampLayout.fromAddress);
        if (ClampScrollable.isAvailable()) Interop.register(ClampScrollable.getType(), ClampScrollable.fromAddress);
        if (ComboRow.isAvailable()) Interop.register(ComboRow.getType(), ComboRow.fromAddress);
        if (EntryRow.isAvailable()) Interop.register(EntryRow.getType(), EntryRow.fromAddress);
        if (EnumListItem.isAvailable()) Interop.register(EnumListItem.getType(), EnumListItem.fromAddress);
        if (EnumListModel.isAvailable()) Interop.register(EnumListModel.getType(), EnumListModel.fromAddress);
        if (ExpanderRow.isAvailable()) Interop.register(ExpanderRow.getType(), ExpanderRow.fromAddress);
        if (Flap.isAvailable()) Interop.register(Flap.getType(), Flap.fromAddress);
        if (HeaderBar.isAvailable()) Interop.register(HeaderBar.getType(), HeaderBar.fromAddress);
        if (Leaflet.isAvailable()) Interop.register(Leaflet.getType(), Leaflet.fromAddress);
        if (LeafletPage.isAvailable()) Interop.register(LeafletPage.getType(), LeafletPage.fromAddress);
        if (MessageDialog.isAvailable()) Interop.register(MessageDialog.getType(), MessageDialog.fromAddress);
        if (PasswordEntryRow.isAvailable()) Interop.register(PasswordEntryRow.getType(), PasswordEntryRow.fromAddress);
        if (PreferencesGroup.isAvailable()) Interop.register(PreferencesGroup.getType(), PreferencesGroup.fromAddress);
        if (PreferencesPage.isAvailable()) Interop.register(PreferencesPage.getType(), PreferencesPage.fromAddress);
        if (PreferencesRow.isAvailable()) Interop.register(PreferencesRow.getType(), PreferencesRow.fromAddress);
        if (PreferencesWindow.isAvailable()) Interop.register(PreferencesWindow.getType(), PreferencesWindow.fromAddress);
        if (PropertyAnimationTarget.isAvailable()) Interop.register(PropertyAnimationTarget.getType(), PropertyAnimationTarget.fromAddress);
        if (SplitButton.isAvailable()) Interop.register(SplitButton.getType(), SplitButton.fromAddress);
        if (SpringAnimation.isAvailable()) Interop.register(SpringAnimation.getType(), SpringAnimation.fromAddress);
        if (Squeezer.isAvailable()) Interop.register(Squeezer.getType(), Squeezer.fromAddress);
        if (SqueezerPage.isAvailable()) Interop.register(SqueezerPage.getType(), SqueezerPage.fromAddress);
        if (StatusPage.isAvailable()) Interop.register(StatusPage.getType(), StatusPage.fromAddress);
        if (StyleManager.isAvailable()) Interop.register(StyleManager.getType(), StyleManager.fromAddress);
        if (SwipeTracker.isAvailable()) Interop.register(SwipeTracker.getType(), SwipeTracker.fromAddress);
        if (TabBar.isAvailable()) Interop.register(TabBar.getType(), TabBar.fromAddress);
        if (TabPage.isAvailable()) Interop.register(TabPage.getType(), TabPage.fromAddress);
        if (TabView.isAvailable()) Interop.register(TabView.getType(), TabView.fromAddress);
        if (TimedAnimation.isAvailable()) Interop.register(TimedAnimation.getType(), TimedAnimation.fromAddress);
        if (Toast.isAvailable()) Interop.register(Toast.getType(), Toast.fromAddress);
        if (ToastOverlay.isAvailable()) Interop.register(ToastOverlay.getType(), ToastOverlay.fromAddress);
        if (ViewStack.isAvailable()) Interop.register(ViewStack.getType(), ViewStack.fromAddress);
        if (ViewStackPage.isAvailable()) Interop.register(ViewStackPage.getType(), ViewStackPage.fromAddress);
        if (ViewSwitcher.isAvailable()) Interop.register(ViewSwitcher.getType(), ViewSwitcher.fromAddress);
        if (ViewSwitcherBar.isAvailable()) Interop.register(ViewSwitcherBar.getType(), ViewSwitcherBar.fromAddress);
        if (ViewSwitcherTitle.isAvailable()) Interop.register(ViewSwitcherTitle.getType(), ViewSwitcherTitle.fromAddress);
        if (Window.isAvailable()) Interop.register(Window.getType(), Window.fromAddress);
        if (WindowTitle.isAvailable()) Interop.register(WindowTitle.getType(), WindowTitle.fromAddress);
        if (Swipeable.isAvailable()) Interop.register(Swipeable.getType(), Swipeable.fromAddress);
    }
}

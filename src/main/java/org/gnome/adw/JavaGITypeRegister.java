package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(AboutWindow.getType(), AboutWindow.fromAddress);
        Interop.typeRegister.put(ActionRow.getType(), ActionRow.fromAddress);
        Interop.typeRegister.put(Animation.getType(), Animation.fromAddress);
        Interop.typeRegister.put(AnimationTarget.getType(), AnimationTarget.fromAddress);
        Interop.typeRegister.put(Application.getType(), Application.fromAddress);
        Interop.typeRegister.put(ApplicationWindow.getType(), ApplicationWindow.fromAddress);
        Interop.typeRegister.put(Avatar.getType(), Avatar.fromAddress);
        Interop.typeRegister.put(Bin.getType(), Bin.fromAddress);
        Interop.typeRegister.put(ButtonContent.getType(), ButtonContent.fromAddress);
        Interop.typeRegister.put(CallbackAnimationTarget.getType(), CallbackAnimationTarget.fromAddress);
        Interop.typeRegister.put(Carousel.getType(), Carousel.fromAddress);
        Interop.typeRegister.put(CarouselIndicatorDots.getType(), CarouselIndicatorDots.fromAddress);
        Interop.typeRegister.put(CarouselIndicatorLines.getType(), CarouselIndicatorLines.fromAddress);
        Interop.typeRegister.put(Clamp.getType(), Clamp.fromAddress);
        Interop.typeRegister.put(ClampLayout.getType(), ClampLayout.fromAddress);
        Interop.typeRegister.put(ClampScrollable.getType(), ClampScrollable.fromAddress);
        Interop.typeRegister.put(ComboRow.getType(), ComboRow.fromAddress);
        Interop.typeRegister.put(EntryRow.getType(), EntryRow.fromAddress);
        Interop.typeRegister.put(EnumListItem.getType(), EnumListItem.fromAddress);
        Interop.typeRegister.put(EnumListModel.getType(), EnumListModel.fromAddress);
        Interop.typeRegister.put(ExpanderRow.getType(), ExpanderRow.fromAddress);
        Interop.typeRegister.put(Flap.getType(), Flap.fromAddress);
        Interop.typeRegister.put(HeaderBar.getType(), HeaderBar.fromAddress);
        Interop.typeRegister.put(Leaflet.getType(), Leaflet.fromAddress);
        Interop.typeRegister.put(LeafletPage.getType(), LeafletPage.fromAddress);
        Interop.typeRegister.put(MessageDialog.getType(), MessageDialog.fromAddress);
        Interop.typeRegister.put(PasswordEntryRow.getType(), PasswordEntryRow.fromAddress);
        Interop.typeRegister.put(PreferencesGroup.getType(), PreferencesGroup.fromAddress);
        Interop.typeRegister.put(PreferencesPage.getType(), PreferencesPage.fromAddress);
        Interop.typeRegister.put(PreferencesRow.getType(), PreferencesRow.fromAddress);
        Interop.typeRegister.put(PreferencesWindow.getType(), PreferencesWindow.fromAddress);
        Interop.typeRegister.put(PropertyAnimationTarget.getType(), PropertyAnimationTarget.fromAddress);
        Interop.typeRegister.put(SplitButton.getType(), SplitButton.fromAddress);
        Interop.typeRegister.put(SpringAnimation.getType(), SpringAnimation.fromAddress);
        Interop.typeRegister.put(Squeezer.getType(), Squeezer.fromAddress);
        Interop.typeRegister.put(SqueezerPage.getType(), SqueezerPage.fromAddress);
        Interop.typeRegister.put(StatusPage.getType(), StatusPage.fromAddress);
        Interop.typeRegister.put(StyleManager.getType(), StyleManager.fromAddress);
        Interop.typeRegister.put(SwipeTracker.getType(), SwipeTracker.fromAddress);
        Interop.typeRegister.put(TabBar.getType(), TabBar.fromAddress);
        Interop.typeRegister.put(TabPage.getType(), TabPage.fromAddress);
        Interop.typeRegister.put(TabView.getType(), TabView.fromAddress);
        Interop.typeRegister.put(TimedAnimation.getType(), TimedAnimation.fromAddress);
        Interop.typeRegister.put(Toast.getType(), Toast.fromAddress);
        Interop.typeRegister.put(ToastOverlay.getType(), ToastOverlay.fromAddress);
        Interop.typeRegister.put(ViewStack.getType(), ViewStack.fromAddress);
        Interop.typeRegister.put(ViewStackPage.getType(), ViewStackPage.fromAddress);
        Interop.typeRegister.put(ViewSwitcher.getType(), ViewSwitcher.fromAddress);
        Interop.typeRegister.put(ViewSwitcherBar.getType(), ViewSwitcherBar.fromAddress);
        Interop.typeRegister.put(ViewSwitcherTitle.getType(), ViewSwitcherTitle.fromAddress);
        Interop.typeRegister.put(Window.getType(), Window.fromAddress);
        Interop.typeRegister.put(WindowTitle.getType(), WindowTitle.fromAddress);
        Interop.typeRegister.put(Swipeable.getType(), Swipeable.fromAddress);
    }
}

package org.gtk.gtk;

import jdk.incubator.foreign.*;
import java.util.HashMap;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static final HashMap<java.lang.Integer, java.lang.Object> signalRegistry = new HashMap<>();
    
    public static void signalWidgetDestroy(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.DestroyHandler) signalRegistry.get(hash);
        handler.signalReceived(new Widget(ProxyFactory.get(source)));
    }
    
    public static void signalWidgetDirectionChanged(MemoryAddress source, int previousDirection, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.DirectionChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Widget(ProxyFactory.get(source)), TextDirection.fromValue(previousDirection));
    }
    
    public static void signalWidgetHide(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.HideHandler) signalRegistry.get(hash);
        handler.signalReceived(new Widget(ProxyFactory.get(source)));
    }
    
    public static boolean signalWidgetKeynavFailed(MemoryAddress source, int direction, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.KeynavFailedHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Widget(ProxyFactory.get(source)), DirectionType.fromValue(direction));
    }
    
    public static void signalWidgetMap(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.MapHandler) signalRegistry.get(hash);
        handler.signalReceived(new Widget(ProxyFactory.get(source)));
    }
    
    public static boolean signalWidgetMnemonicActivate(MemoryAddress source, boolean groupCycling, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.MnemonicActivateHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Widget(ProxyFactory.get(source)), groupCycling);
    }
    
    public static void signalWidgetMoveFocus(MemoryAddress source, int direction, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.MoveFocusHandler) signalRegistry.get(hash);
        handler.signalReceived(new Widget(ProxyFactory.get(source)), DirectionType.fromValue(direction));
    }
    
    public static boolean signalWidgetQueryTooltip(MemoryAddress source, int x, int y, boolean keyboardMode, MemoryAddress tooltip, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.QueryTooltipHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Widget(ProxyFactory.get(source)), x, y, keyboardMode, new Tooltip(ProxyFactory.get(tooltip, false)));
    }
    
    public static void signalWidgetRealize(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.RealizeHandler) signalRegistry.get(hash);
        handler.signalReceived(new Widget(ProxyFactory.get(source)));
    }
    
    public static void signalWidgetShow(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.ShowHandler) signalRegistry.get(hash);
        handler.signalReceived(new Widget(ProxyFactory.get(source)));
    }
    
    public static void signalWidgetStateFlagsChanged(MemoryAddress source, int flags, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.StateFlagsChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Widget(ProxyFactory.get(source)), flags);
    }
    
    public static void signalWidgetUnmap(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.UnmapHandler) signalRegistry.get(hash);
        handler.signalReceived(new Widget(ProxyFactory.get(source)));
    }
    
    public static void signalWidgetUnrealize(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.UnrealizeHandler) signalRegistry.get(hash);
        handler.signalReceived(new Widget(ProxyFactory.get(source)));
    }
    
    public static void signalCellAreaAddEditable(MemoryAddress source, MemoryAddress renderer, MemoryAddress editable, MemoryAddress cellArea, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellArea.AddEditableHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellArea(ProxyFactory.get(source)), new CellRenderer(ProxyFactory.get(renderer, false)), new CellEditable.CellEditableImpl(ProxyFactory.get(editable, false)), new org.gtk.gdk.Rectangle(ProxyFactory.get(cellArea, false)), path.getUtf8String(0));
    }
    
    public static void signalCellAreaApplyAttributes(MemoryAddress source, MemoryAddress model, MemoryAddress iter, boolean isExpander, boolean isExpanded, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellArea.ApplyAttributesHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellArea(ProxyFactory.get(source)), new TreeModel.TreeModelImpl(ProxyFactory.get(model, false)), new TreeIter(ProxyFactory.get(iter, false)), isExpander, isExpanded);
    }
    
    public static void signalCellAreaFocusChanged(MemoryAddress source, MemoryAddress renderer, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellArea.FocusChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellArea(ProxyFactory.get(source)), new CellRenderer(ProxyFactory.get(renderer, false)), path.getUtf8String(0));
    }
    
    public static void signalCellAreaRemoveEditable(MemoryAddress source, MemoryAddress renderer, MemoryAddress editable, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellArea.RemoveEditableHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellArea(ProxyFactory.get(source)), new CellRenderer(ProxyFactory.get(renderer, false)), new CellEditable.CellEditableImpl(ProxyFactory.get(editable, false)));
    }
    
    public static void signalFlowBoxActivateCursorChild(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.ActivateCursorChildHandler) signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(ProxyFactory.get(source)));
    }
    
    public static void signalFlowBoxChildActivated(MemoryAddress source, MemoryAddress child, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.ChildActivatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(ProxyFactory.get(source)), new FlowBoxChild(ProxyFactory.get(child, false)));
    }
    
    public static boolean signalFlowBoxMoveCursor(MemoryAddress source, int step, int count, boolean extend, boolean modify, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.MoveCursorHandler) signalRegistry.get(hash);
        return handler.signalReceived(new FlowBox(ProxyFactory.get(source)), MovementStep.fromValue(step), count, extend, modify);
    }
    
    public static void signalFlowBoxSelectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.SelectAllHandler) signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(ProxyFactory.get(source)));
    }
    
    public static void signalFlowBoxSelectedChildrenChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.SelectedChildrenChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(ProxyFactory.get(source)));
    }
    
    public static void signalFlowBoxToggleCursorChild(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.ToggleCursorChildHandler) signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(ProxyFactory.get(source)));
    }
    
    public static void signalFlowBoxUnselectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.UnselectAllHandler) signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(ProxyFactory.get(source)));
    }
    
    public static void signalButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Button.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new Button(ProxyFactory.get(source)));
    }
    
    public static void signalButtonClicked(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Button.ClickedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Button(ProxyFactory.get(source)));
    }
    
    public static void signalFontChooserFontActivated(MemoryAddress source, MemoryAddress fontname, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FontChooser.FontActivatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new FontChooser.FontChooserImpl(ProxyFactory.get(source)), fontname.getUtf8String(0));
    }
    
    public static boolean signalShortcutsSectionChangeCurrentPage(MemoryAddress source, int object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ShortcutsSection.ChangeCurrentPageHandler) signalRegistry.get(hash);
        return handler.signalReceived(new ShortcutsSection(ProxyFactory.get(source)), object);
    }
    
    public static void signalShortcutsWindowClose(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ShortcutsWindow.CloseHandler) signalRegistry.get(hash);
        handler.signalReceived(new ShortcutsWindow(ProxyFactory.get(source)));
    }
    
    public static void signalShortcutsWindowSearch(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ShortcutsWindow.SearchHandler) signalRegistry.get(hash);
        handler.signalReceived(new ShortcutsWindow(ProxyFactory.get(source)));
    }
    
    public static void signalEntryActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Entry.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new Entry(ProxyFactory.get(source)));
    }
    
    public static void signalEntryIconPress(MemoryAddress source, int iconPos, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Entry.IconPressHandler) signalRegistry.get(hash);
        handler.signalReceived(new Entry(ProxyFactory.get(source)), EntryIconPosition.fromValue(iconPos));
    }
    
    public static void signalEntryIconRelease(MemoryAddress source, int iconPos, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Entry.IconReleaseHandler) signalRegistry.get(hash);
        handler.signalReceived(new Entry(ProxyFactory.get(source)), EntryIconPosition.fromValue(iconPos));
    }
    
    public static void signalRecentManagerChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (RecentManager.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new RecentManager(ProxyFactory.get(source)));
    }
    
    public static void signalCssProviderParsingError(MemoryAddress source, MemoryAddress section, MemoryAddress error, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CssProvider.ParsingErrorHandler) signalRegistry.get(hash);
        handler.signalReceived(new CssProvider(ProxyFactory.get(source)), new CssSection(ProxyFactory.get(section, false)), new org.gtk.glib.Error(ProxyFactory.get(error, false)));
    }
    
    public static void signalToggleButtonToggled(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ToggleButton.ToggledHandler) signalRegistry.get(hash);
        handler.signalReceived(new ToggleButton(ProxyFactory.get(source)));
    }
    
    public static void signalDragSourceDragBegin(MemoryAddress source, MemoryAddress drag, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DragSource.DragBeginHandler) signalRegistry.get(hash);
        handler.signalReceived(new DragSource(ProxyFactory.get(source)), new org.gtk.gdk.Drag(ProxyFactory.get(drag, false)));
    }
    
    public static boolean signalDragSourceDragCancel(MemoryAddress source, MemoryAddress drag, int reason, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DragSource.DragCancelHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DragSource(ProxyFactory.get(source)), new org.gtk.gdk.Drag(ProxyFactory.get(drag, false)), org.gtk.gdk.DragCancelReason.fromValue(reason));
    }
    
    public static void signalDragSourceDragEnd(MemoryAddress source, MemoryAddress drag, boolean deleteData, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DragSource.DragEndHandler) signalRegistry.get(hash);
        handler.signalReceived(new DragSource(ProxyFactory.get(source)), new org.gtk.gdk.Drag(ProxyFactory.get(drag, false)), deleteData);
    }
    
    public static void signalDragSourcePrepare(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DragSource.PrepareHandler) signalRegistry.get(hash);
        handler.signalReceived(new DragSource(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalFileChooserWidgetDesktopFolder(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.DesktopFolderHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)));
    }
    
    public static void signalFileChooserWidgetDownFolder(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.DownFolderHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)));
    }
    
    public static void signalFileChooserWidgetHomeFolder(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.HomeFolderHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)));
    }
    
    public static void signalFileChooserWidgetLocationPopup(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.LocationPopupHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)), path.getUtf8String(0));
    }
    
    public static void signalFileChooserWidgetLocationPopupOnPaste(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.LocationPopupOnPasteHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)));
    }
    
    public static void signalFileChooserWidgetLocationTogglePopup(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.LocationTogglePopupHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)));
    }
    
    public static void signalFileChooserWidgetPlacesShortcut(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.PlacesShortcutHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)));
    }
    
    public static void signalFileChooserWidgetQuickBookmark(MemoryAddress source, int bookmarkIndex, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.QuickBookmarkHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)), bookmarkIndex);
    }
    
    public static void signalFileChooserWidgetRecentShortcut(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.RecentShortcutHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)));
    }
    
    public static void signalFileChooserWidgetSearchShortcut(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.SearchShortcutHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)));
    }
    
    public static void signalFileChooserWidgetShowHidden(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.ShowHiddenHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)));
    }
    
    public static void signalFileChooserWidgetUpFolder(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.UpFolderHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(ProxyFactory.get(source)));
    }
    
    public static void signalListViewActivate(MemoryAddress source, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListView.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListView(ProxyFactory.get(source)), position);
    }
    
    public static void signalDialogClose(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Dialog.CloseHandler) signalRegistry.get(hash);
        handler.signalReceived(new Dialog(ProxyFactory.get(source)));
    }
    
    public static void signalDialogResponse(MemoryAddress source, int responseId, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Dialog.ResponseHandler) signalRegistry.get(hash);
        handler.signalReceived(new Dialog(ProxyFactory.get(source)), responseId);
    }
    
    public static void signalFontButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FontButton.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new FontButton(ProxyFactory.get(source)));
    }
    
    public static void signalFontButtonFontSet(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FontButton.FontSetHandler) signalRegistry.get(hash);
        handler.signalReceived(new FontButton(ProxyFactory.get(source)));
    }
    
    public static void signalExpanderActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Expander.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new Expander(ProxyFactory.get(source)));
    }
    
    public static void signalScrolledWindowEdgeOvershot(MemoryAddress source, int pos, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScrolledWindow.EdgeOvershotHandler) signalRegistry.get(hash);
        handler.signalReceived(new ScrolledWindow(ProxyFactory.get(source)), PositionType.fromValue(pos));
    }
    
    public static void signalScrolledWindowEdgeReached(MemoryAddress source, int pos, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScrolledWindow.EdgeReachedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ScrolledWindow(ProxyFactory.get(source)), PositionType.fromValue(pos));
    }
    
    public static void signalScrolledWindowMoveFocusOut(MemoryAddress source, int directionType, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScrolledWindow.MoveFocusOutHandler) signalRegistry.get(hash);
        handler.signalReceived(new ScrolledWindow(ProxyFactory.get(source)), DirectionType.fromValue(directionType));
    }
    
    public static boolean signalScrolledWindowScrollChild(MemoryAddress source, int scroll, boolean horizontal, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScrolledWindow.ScrollChildHandler) signalRegistry.get(hash);
        return handler.signalReceived(new ScrolledWindow(ProxyFactory.get(source)), ScrollType.fromValue(scroll), horizontal);
    }
    
    public static void signalPrintOperationBeginPrint(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.BeginPrintHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(ProxyFactory.get(source)), new PrintContext(ProxyFactory.get(context, false)));
    }
    
    public static void signalPrintOperationCreateCustomWidget(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.CreateCustomWidgetHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(ProxyFactory.get(source)));
    }
    
    public static void signalPrintOperationCustomWidgetApply(MemoryAddress source, MemoryAddress widget, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.CustomWidgetApplyHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(ProxyFactory.get(source)), new Widget(ProxyFactory.get(widget, false)));
    }
    
    public static void signalPrintOperationDone(MemoryAddress source, int result, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.DoneHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(ProxyFactory.get(source)), PrintOperationResult.fromValue(result));
    }
    
    public static void signalPrintOperationDrawPage(MemoryAddress source, MemoryAddress context, int pageNr, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.DrawPageHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(ProxyFactory.get(source)), new PrintContext(ProxyFactory.get(context, false)), pageNr);
    }
    
    public static void signalPrintOperationEndPrint(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.EndPrintHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(ProxyFactory.get(source)), new PrintContext(ProxyFactory.get(context, false)));
    }
    
    public static boolean signalPrintOperationPaginate(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.PaginateHandler) signalRegistry.get(hash);
        return handler.signalReceived(new PrintOperation(ProxyFactory.get(source)), new PrintContext(ProxyFactory.get(context, false)));
    }
    
    public static boolean signalPrintOperationPreview(MemoryAddress source, MemoryAddress preview, MemoryAddress context, MemoryAddress parent, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.PreviewHandler) signalRegistry.get(hash);
        return handler.signalReceived(new PrintOperation(ProxyFactory.get(source)), new PrintOperationPreview.PrintOperationPreviewImpl(ProxyFactory.get(preview, false)), new PrintContext(ProxyFactory.get(context, false)), new Window(ProxyFactory.get(parent, false)));
    }
    
    public static void signalPrintOperationRequestPageSetup(MemoryAddress source, MemoryAddress context, int pageNr, MemoryAddress setup, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.RequestPageSetupHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(ProxyFactory.get(source)), new PrintContext(ProxyFactory.get(context, false)), pageNr, new PageSetup(ProxyFactory.get(setup, false)));
    }
    
    public static void signalPrintOperationStatusChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.StatusChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(ProxyFactory.get(source)));
    }
    
    public static void signalPrintOperationUpdateCustomWidget(MemoryAddress source, MemoryAddress widget, MemoryAddress setup, MemoryAddress settings, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.UpdateCustomWidgetHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(ProxyFactory.get(source)), new Widget(ProxyFactory.get(widget, false)), new PageSetup(ProxyFactory.get(setup, false)), new PrintSettings(ProxyFactory.get(settings, false)));
    }
    
    public static void signalAppChooserWidgetApplicationActivated(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppChooserWidget.ApplicationActivatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new AppChooserWidget(ProxyFactory.get(source)), new org.gtk.gio.AppInfo.AppInfoImpl(ProxyFactory.get(application, false)));
    }
    
    public static void signalAppChooserWidgetApplicationSelected(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppChooserWidget.ApplicationSelectedHandler) signalRegistry.get(hash);
        handler.signalReceived(new AppChooserWidget(ProxyFactory.get(source)), new org.gtk.gio.AppInfo.AppInfoImpl(ProxyFactory.get(application, false)));
    }
    
    public static void signalEventControllerMotionEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerMotion.EnterHandler) signalRegistry.get(hash);
        handler.signalReceived(new EventControllerMotion(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalEventControllerMotionLeave(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerMotion.LeaveHandler) signalRegistry.get(hash);
        handler.signalReceived(new EventControllerMotion(ProxyFactory.get(source)));
    }
    
    public static void signalEventControllerMotionMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerMotion.MotionHandler) signalRegistry.get(hash);
        handler.signalReceived(new EventControllerMotion(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalPasswordEntryActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PasswordEntry.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new PasswordEntry(ProxyFactory.get(source)));
    }
    
    public static void signalGestureClickPressed(MemoryAddress source, int nPress, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureClick.PressedHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureClick(ProxyFactory.get(source)), nPress, x, y);
    }
    
    public static void signalGestureClickReleased(MemoryAddress source, int nPress, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureClick.ReleasedHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureClick(ProxyFactory.get(source)), nPress, x, y);
    }
    
    public static void signalGestureClickStopped(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureClick.StoppedHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureClick(ProxyFactory.get(source)));
    }
    
    public static void signalGestureClickUnpairedRelease(MemoryAddress source, double x, double y, int button, MemoryAddress sequence, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureClick.UnpairedReleaseHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureClick(ProxyFactory.get(source)), x, y, button, new org.gtk.gdk.EventSequence(ProxyFactory.get(sequence, false)));
    }
    
    public static boolean signalIconViewActivateCursorItem(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.ActivateCursorItemHandler) signalRegistry.get(hash);
        return handler.signalReceived(new IconView(ProxyFactory.get(source)));
    }
    
    public static void signalIconViewItemActivated(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.ItemActivatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new IconView(ProxyFactory.get(source)), new TreePath(ProxyFactory.get(path, false)));
    }
    
    public static boolean signalIconViewMoveCursor(MemoryAddress source, int step, int count, boolean extend, boolean modify, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.MoveCursorHandler) signalRegistry.get(hash);
        return handler.signalReceived(new IconView(ProxyFactory.get(source)), MovementStep.fromValue(step), count, extend, modify);
    }
    
    public static void signalIconViewSelectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.SelectAllHandler) signalRegistry.get(hash);
        handler.signalReceived(new IconView(ProxyFactory.get(source)));
    }
    
    public static void signalIconViewSelectCursorItem(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.SelectCursorItemHandler) signalRegistry.get(hash);
        handler.signalReceived(new IconView(ProxyFactory.get(source)));
    }
    
    public static void signalIconViewSelectionChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.SelectionChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new IconView(ProxyFactory.get(source)));
    }
    
    public static void signalIconViewToggleCursorItem(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.ToggleCursorItemHandler) signalRegistry.get(hash);
        handler.signalReceived(new IconView(ProxyFactory.get(source)));
    }
    
    public static void signalIconViewUnselectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.UnselectAllHandler) signalRegistry.get(hash);
        handler.signalReceived(new IconView(ProxyFactory.get(source)));
    }
    
    public static void signalPrintOperationPreviewGotPageSize(MemoryAddress source, MemoryAddress context, MemoryAddress pageSetup, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperationPreview.GotPageSizeHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(ProxyFactory.get(source)), new PrintContext(ProxyFactory.get(context, false)), new PageSetup(ProxyFactory.get(pageSetup, false)));
    }
    
    public static void signalPrintOperationPreviewReady(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperationPreview.ReadyHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(ProxyFactory.get(source)), new PrintContext(ProxyFactory.get(context, false)));
    }
    
    public static void signalCellRendererTextEdited(MemoryAddress source, MemoryAddress path, MemoryAddress newText, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRendererText.EditedHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellRendererText(ProxyFactory.get(source)), path.getUtf8String(0), newText.getUtf8String(0));
    }
    
    public static void signalSorterChanged(MemoryAddress source, int change, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Sorter.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Sorter(ProxyFactory.get(source)), SorterChange.fromValue(change));
    }
    
    public static void signalListBoxRowActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBoxRow.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListBoxRow(ProxyFactory.get(source)));
    }
    
    public static void signalAdjustmentChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Adjustment.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Adjustment(ProxyFactory.get(source)));
    }
    
    public static void signalAdjustmentValueChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Adjustment.ValueChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Adjustment(ProxyFactory.get(source)));
    }
    
    public static void signalAppChooserButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppChooserButton.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new AppChooserButton(ProxyFactory.get(source)));
    }
    
    public static void signalAppChooserButtonChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppChooserButton.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new AppChooserButton(ProxyFactory.get(source)));
    }
    
    public static void signalAppChooserButtonCustomItemActivated(MemoryAddress source, MemoryAddress itemName, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppChooserButton.CustomItemActivatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new AppChooserButton(ProxyFactory.get(source)), itemName.getUtf8String(0));
    }
    
    public static void signalCellRendererToggleToggled(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRendererToggle.ToggledHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellRendererToggle(ProxyFactory.get(source)), path.getUtf8String(0));
    }
    
    public static void signalApplicationQueryEnd(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.QueryEndHandler) signalRegistry.get(hash);
        handler.signalReceived(new Application(ProxyFactory.get(source)));
    }
    
    public static void signalApplicationWindowAdded(MemoryAddress source, MemoryAddress window, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.WindowAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Application(ProxyFactory.get(source)), new Window(ProxyFactory.get(window, false)));
    }
    
    public static void signalApplicationWindowRemoved(MemoryAddress source, MemoryAddress window, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.WindowRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Application(ProxyFactory.get(source)), new Window(ProxyFactory.get(window, false)));
    }
    
    public static void signalDropControllerMotionEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropControllerMotion.EnterHandler) signalRegistry.get(hash);
        handler.signalReceived(new DropControllerMotion(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalDropControllerMotionLeave(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropControllerMotion.LeaveHandler) signalRegistry.get(hash);
        handler.signalReceived(new DropControllerMotion(ProxyFactory.get(source)));
    }
    
    public static void signalDropControllerMotionMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropControllerMotion.MotionHandler) signalRegistry.get(hash);
        handler.signalReceived(new DropControllerMotion(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalPopoverActivateDefault(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Popover.ActivateDefaultHandler) signalRegistry.get(hash);
        handler.signalReceived(new Popover(ProxyFactory.get(source)));
    }
    
    public static void signalPopoverClosed(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Popover.ClosedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Popover(ProxyFactory.get(source)));
    }
    
    public static void signalGesturePanPan(MemoryAddress source, int direction, double offset, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GesturePan.PanHandler) signalRegistry.get(hash);
        handler.signalReceived(new GesturePan(ProxyFactory.get(source)), PanDirection.fromValue(direction), offset);
    }
    
    public static boolean signalPanedAcceptPosition(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.AcceptPositionHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Paned(ProxyFactory.get(source)));
    }
    
    public static boolean signalPanedCancelPosition(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.CancelPositionHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Paned(ProxyFactory.get(source)));
    }
    
    public static boolean signalPanedCycleChildFocus(MemoryAddress source, boolean reversed, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.CycleChildFocusHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Paned(ProxyFactory.get(source)), reversed);
    }
    
    public static boolean signalPanedCycleHandleFocus(MemoryAddress source, boolean reversed, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.CycleHandleFocusHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Paned(ProxyFactory.get(source)), reversed);
    }
    
    public static boolean signalPanedMoveHandle(MemoryAddress source, int scrollType, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.MoveHandleHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Paned(ProxyFactory.get(source)), ScrollType.fromValue(scrollType));
    }
    
    public static boolean signalPanedToggleHandleFocus(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.ToggleHandleFocusHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Paned(ProxyFactory.get(source)));
    }
    
    public static void signalGestureStylusDown(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.DownHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalGestureStylusMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.MotionHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalGestureStylusProximity(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.ProximityHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalGestureStylusUp(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.UpHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalDrawingAreaResize(MemoryAddress source, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DrawingArea.ResizeHandler) signalRegistry.get(hash);
        handler.signalReceived(new DrawingArea(ProxyFactory.get(source)), width, height);
    }
    
    public static void signalColorButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ColorButton.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new ColorButton(ProxyFactory.get(source)));
    }
    
    public static void signalColorButtonColorSet(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ColorButton.ColorSetHandler) signalRegistry.get(hash);
        handler.signalReceived(new ColorButton(ProxyFactory.get(source)));
    }
    
    public static boolean signalEntryCompletionCursorOnMatch(MemoryAddress source, MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryCompletion.CursorOnMatchHandler) signalRegistry.get(hash);
        return handler.signalReceived(new EntryCompletion(ProxyFactory.get(source)), new TreeModel.TreeModelImpl(ProxyFactory.get(model, false)), new TreeIter(ProxyFactory.get(iter, false)));
    }
    
    public static boolean signalEntryCompletionInsertPrefix(MemoryAddress source, MemoryAddress prefix, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryCompletion.InsertPrefixHandler) signalRegistry.get(hash);
        return handler.signalReceived(new EntryCompletion(ProxyFactory.get(source)), prefix.getUtf8String(0));
    }
    
    public static boolean signalEntryCompletionMatchSelected(MemoryAddress source, MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryCompletion.MatchSelectedHandler) signalRegistry.get(hash);
        return handler.signalReceived(new EntryCompletion(ProxyFactory.get(source)), new TreeModel.TreeModelImpl(ProxyFactory.get(model, false)), new TreeIter(ProxyFactory.get(iter, false)));
    }
    
    public static void signalEntryCompletionNoMatches(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryCompletion.NoMatchesHandler) signalRegistry.get(hash);
        handler.signalReceived(new EntryCompletion(ProxyFactory.get(source)));
    }
    
    public static void signalSpinButtonChangeValue(MemoryAddress source, int scroll, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.ChangeValueHandler) signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(ProxyFactory.get(source)), ScrollType.fromValue(scroll));
    }
    
    public static void signalSpinButtonInput(MemoryAddress source, double newValue, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.InputHandler) signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(ProxyFactory.get(source)), newValue);
    }
    
    public static boolean signalSpinButtonOutput(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.OutputHandler) signalRegistry.get(hash);
        return handler.signalReceived(new SpinButton(ProxyFactory.get(source)));
    }
    
    public static void signalSpinButtonValueChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.ValueChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(ProxyFactory.get(source)));
    }
    
    public static void signalSpinButtonWrapped(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.WrappedHandler) signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(ProxyFactory.get(source)));
    }
    
    public static void signalScaleButtonPopdown(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScaleButton.PopdownHandler) signalRegistry.get(hash);
        handler.signalReceived(new ScaleButton(ProxyFactory.get(source)));
    }
    
    public static void signalScaleButtonPopup(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScaleButton.PopupHandler) signalRegistry.get(hash);
        handler.signalReceived(new ScaleButton(ProxyFactory.get(source)));
    }
    
    public static void signalScaleButtonValueChanged(MemoryAddress source, double value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScaleButton.ValueChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ScaleButton(ProxyFactory.get(source)), value);
    }
    
    public static void signalTextActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)));
    }
    
    public static void signalTextBackspace(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.BackspaceHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)));
    }
    
    public static void signalTextCopyClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.CopyClipboardHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)));
    }
    
    public static void signalTextCutClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.CutClipboardHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)));
    }
    
    public static void signalTextDeleteFromCursor(MemoryAddress source, int type, int count, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.DeleteFromCursorHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)), DeleteType.fromValue(type), count);
    }
    
    public static void signalTextInsertAtCursor(MemoryAddress source, MemoryAddress string, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.InsertAtCursorHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)), string.getUtf8String(0));
    }
    
    public static void signalTextInsertEmoji(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.InsertEmojiHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)));
    }
    
    public static void signalTextMoveCursor(MemoryAddress source, int step, int count, boolean extend, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.MoveCursorHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)), MovementStep.fromValue(step), count, extend);
    }
    
    public static void signalTextPasteClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.PasteClipboardHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)));
    }
    
    public static void signalTextPreeditChanged(MemoryAddress source, MemoryAddress preedit, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.PreeditChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)), preedit.getUtf8String(0));
    }
    
    public static void signalTextToggleOverwrite(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.ToggleOverwriteHandler) signalRegistry.get(hash);
        handler.signalReceived(new Text(ProxyFactory.get(source)));
    }
    
    public static void signalGestureSwipeSwipe(MemoryAddress source, double velocityX, double velocityY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureSwipe.SwipeHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureSwipe(ProxyFactory.get(source)), velocityX, velocityY);
    }
    
    public static void signalCellRendererComboChanged(MemoryAddress source, MemoryAddress pathString, MemoryAddress newIter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRendererCombo.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellRendererCombo(ProxyFactory.get(source)), pathString.getUtf8String(0), new TreeIter(ProxyFactory.get(newIter, false)));
    }
    
    public static void signalSelectionModelSelectionChanged(MemoryAddress source, int position, int nItems, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SelectionModel.SelectionChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new SelectionModel.SelectionModelImpl(ProxyFactory.get(source)), position, nItems);
    }
    
    public static void signalTextViewBackspace(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.BackspaceHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)));
    }
    
    public static void signalTextViewCopyClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.CopyClipboardHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)));
    }
    
    public static void signalTextViewCutClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.CutClipboardHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)));
    }
    
    public static void signalTextViewDeleteFromCursor(MemoryAddress source, int type, int count, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.DeleteFromCursorHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)), DeleteType.fromValue(type), count);
    }
    
    public static boolean signalTextViewExtendSelection(MemoryAddress source, int granularity, MemoryAddress location, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.ExtendSelectionHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TextView(ProxyFactory.get(source)), TextExtendSelection.fromValue(granularity), new TextIter(ProxyFactory.get(location, false)), new TextIter(ProxyFactory.get(start, false)), new TextIter(ProxyFactory.get(end, false)));
    }
    
    public static void signalTextViewInsertAtCursor(MemoryAddress source, MemoryAddress string, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.InsertAtCursorHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)), string.getUtf8String(0));
    }
    
    public static void signalTextViewInsertEmoji(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.InsertEmojiHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)));
    }
    
    public static void signalTextViewMoveCursor(MemoryAddress source, int step, int count, boolean extendSelection, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.MoveCursorHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)), MovementStep.fromValue(step), count, extendSelection);
    }
    
    public static void signalTextViewMoveViewport(MemoryAddress source, int step, int count, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.MoveViewportHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)), ScrollStep.fromValue(step), count);
    }
    
    public static void signalTextViewPasteClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.PasteClipboardHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)));
    }
    
    public static void signalTextViewPreeditChanged(MemoryAddress source, MemoryAddress preedit, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.PreeditChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)), preedit.getUtf8String(0));
    }
    
    public static void signalTextViewSelectAll(MemoryAddress source, boolean select, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.SelectAllHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)), select);
    }
    
    public static void signalTextViewSetAnchor(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.SetAnchorHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)));
    }
    
    public static void signalTextViewToggleCursorVisible(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.ToggleCursorVisibleHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)));
    }
    
    public static void signalTextViewToggleOverwrite(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.ToggleOverwriteHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextView(ProxyFactory.get(source)));
    }
    
    public static void signalRangeAdjustBounds(MemoryAddress source, double value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Range.AdjustBoundsHandler) signalRegistry.get(hash);
        handler.signalReceived(new Range(ProxyFactory.get(source)), value);
    }
    
    public static boolean signalRangeChangeValue(MemoryAddress source, int scroll, double value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Range.ChangeValueHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Range(ProxyFactory.get(source)), ScrollType.fromValue(scroll), value);
    }
    
    public static void signalRangeMoveSlider(MemoryAddress source, int step, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Range.MoveSliderHandler) signalRegistry.get(hash);
        handler.signalReceived(new Range(ProxyFactory.get(source)), ScrollType.fromValue(step));
    }
    
    public static void signalRangeValueChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Range.ValueChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Range(ProxyFactory.get(source)));
    }
    
    public static void signalGestureLongPressCancelled(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureLongPress.CancelledHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureLongPress(ProxyFactory.get(source)));
    }
    
    public static void signalGestureLongPressPressed(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureLongPress.PressedHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureLongPress(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalEntryBufferDeletedText(MemoryAddress source, int position, int nChars, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryBuffer.DeletedTextHandler) signalRegistry.get(hash);
        handler.signalReceived(new EntryBuffer(ProxyFactory.get(source)), position, nChars);
    }
    
    public static void signalEntryBufferInsertedText(MemoryAddress source, int position, MemoryAddress chars, int nChars, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryBuffer.InsertedTextHandler) signalRegistry.get(hash);
        handler.signalReceived(new EntryBuffer(ProxyFactory.get(source)), position, chars.getUtf8String(0), nChars);
    }
    
    public static void signalIMContextCommit(MemoryAddress source, MemoryAddress str, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.CommitHandler) signalRegistry.get(hash);
        handler.signalReceived(new IMContext(ProxyFactory.get(source)), str.getUtf8String(0));
    }
    
    public static boolean signalIMContextDeleteSurrounding(MemoryAddress source, int offset, int nChars, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.DeleteSurroundingHandler) signalRegistry.get(hash);
        return handler.signalReceived(new IMContext(ProxyFactory.get(source)), offset, nChars);
    }
    
    public static void signalIMContextPreeditChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.PreeditChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new IMContext(ProxyFactory.get(source)));
    }
    
    public static void signalIMContextPreeditEnd(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.PreeditEndHandler) signalRegistry.get(hash);
        handler.signalReceived(new IMContext(ProxyFactory.get(source)));
    }
    
    public static void signalIMContextPreeditStart(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.PreeditStartHandler) signalRegistry.get(hash);
        handler.signalReceived(new IMContext(ProxyFactory.get(source)));
    }
    
    public static boolean signalIMContextRetrieveSurrounding(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.RetrieveSurroundingHandler) signalRegistry.get(hash);
        return handler.signalReceived(new IMContext(ProxyFactory.get(source)));
    }
    
    public static void signalMenuButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MenuButton.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new MenuButton(ProxyFactory.get(source)));
    }
    
    public static boolean signalDropTargetAsyncAccept(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.AcceptHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DropTargetAsync(ProxyFactory.get(source)), new org.gtk.gdk.Drop(ProxyFactory.get(drop, false)));
    }
    
    public static void signalDropTargetAsyncDragEnter(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DragEnterHandler) signalRegistry.get(hash);
        handler.signalReceived(new DropTargetAsync(ProxyFactory.get(source)), new org.gtk.gdk.Drop(ProxyFactory.get(drop, false)), x, y);
    }
    
    public static void signalDropTargetAsyncDragLeave(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DragLeaveHandler) signalRegistry.get(hash);
        handler.signalReceived(new DropTargetAsync(ProxyFactory.get(source)), new org.gtk.gdk.Drop(ProxyFactory.get(drop, false)));
    }
    
    public static void signalDropTargetAsyncDragMotion(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DragMotionHandler) signalRegistry.get(hash);
        handler.signalReceived(new DropTargetAsync(ProxyFactory.get(source)), new org.gtk.gdk.Drop(ProxyFactory.get(drop, false)), x, y);
    }
    
    public static boolean signalDropTargetAsyncDrop(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DropHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DropTargetAsync(ProxyFactory.get(source)), new org.gtk.gdk.Drop(ProxyFactory.get(drop, false)), x, y);
    }
    
    public static void signalEditableChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Editable.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Editable.EditableImpl(ProxyFactory.get(source)));
    }
    
    public static void signalEditableDeleteText(MemoryAddress source, int startPos, int endPos, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Editable.DeleteTextHandler) signalRegistry.get(hash);
        handler.signalReceived(new Editable.EditableImpl(ProxyFactory.get(source)), startPos, endPos);
    }
    
    public static void signalEditableInsertText(MemoryAddress source, MemoryAddress text, int length, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Editable.InsertTextHandler) signalRegistry.get(hash);
        handler.signalReceived(new Editable.EditableImpl(ProxyFactory.get(source)), text.getUtf8String(0), length, position);
    }
    
    public static void signalEmojiChooserEmojiPicked(MemoryAddress source, MemoryAddress text, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EmojiChooser.EmojiPickedHandler) signalRegistry.get(hash);
        handler.signalReceived(new EmojiChooser(ProxyFactory.get(source)), text.getUtf8String(0));
    }
    
    public static void signalColorChooserColorActivated(MemoryAddress source, MemoryAddress color, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ColorChooser.ColorActivatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ColorChooser.ColorChooserImpl(ProxyFactory.get(source)), new org.gtk.gdk.RGBA(ProxyFactory.get(color, false)));
    }
    
    public static void signalGestureRotateAngleChanged(MemoryAddress source, double angle, double angleDelta, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureRotate.AngleChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureRotate(ProxyFactory.get(source)), angle, angleDelta);
    }
    
    public static void signalTreeViewColumnsChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.ColumnsChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeView(ProxyFactory.get(source)));
    }
    
    public static void signalTreeViewCursorChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.CursorChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeView(ProxyFactory.get(source)));
    }
    
    public static boolean signalTreeViewExpandCollapseCursorRow(MemoryAddress source, boolean object, boolean p0, boolean p1, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.ExpandCollapseCursorRowHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(ProxyFactory.get(source)), object, p0, p1);
    }
    
    public static boolean signalTreeViewMoveCursor(MemoryAddress source, int step, int direction, boolean extend, boolean modify, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.MoveCursorHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(ProxyFactory.get(source)), MovementStep.fromValue(step), direction, extend, modify);
    }
    
    public static void signalTreeViewRowActivated(MemoryAddress source, MemoryAddress path, MemoryAddress column, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.RowActivatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeView(ProxyFactory.get(source)), new TreePath(ProxyFactory.get(path, false)), new TreeViewColumn(ProxyFactory.get(column, false)));
    }
    
    public static void signalTreeViewRowCollapsed(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.RowCollapsedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeView(ProxyFactory.get(source)), new TreeIter(ProxyFactory.get(iter, false)), new TreePath(ProxyFactory.get(path, false)));
    }
    
    public static void signalTreeViewRowExpanded(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.RowExpandedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeView(ProxyFactory.get(source)), new TreeIter(ProxyFactory.get(iter, false)), new TreePath(ProxyFactory.get(path, false)));
    }
    
    public static boolean signalTreeViewSelectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.SelectAllHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(ProxyFactory.get(source)));
    }
    
    public static boolean signalTreeViewSelectCursorParent(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.SelectCursorParentHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(ProxyFactory.get(source)));
    }
    
    public static boolean signalTreeViewSelectCursorRow(MemoryAddress source, boolean object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.SelectCursorRowHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(ProxyFactory.get(source)), object);
    }
    
    public static boolean signalTreeViewStartInteractiveSearch(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.StartInteractiveSearchHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(ProxyFactory.get(source)));
    }
    
    public static boolean signalTreeViewTestCollapseRow(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.TestCollapseRowHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(ProxyFactory.get(source)), new TreeIter(ProxyFactory.get(iter, false)), new TreePath(ProxyFactory.get(path, false)));
    }
    
    public static boolean signalTreeViewTestExpandRow(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.TestExpandRowHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(ProxyFactory.get(source)), new TreeIter(ProxyFactory.get(iter, false)), new TreePath(ProxyFactory.get(path, false)));
    }
    
    public static boolean signalTreeViewToggleCursorRow(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.ToggleCursorRowHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(ProxyFactory.get(source)));
    }
    
    public static boolean signalTreeViewUnselectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.UnselectAllHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(ProxyFactory.get(source)));
    }
    
    public static void signalGridViewActivate(MemoryAddress source, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GridView.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new GridView(ProxyFactory.get(source)), position);
    }
    
    public static void signalCellRendererAccelAccelCleared(MemoryAddress source, MemoryAddress pathString, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRendererAccel.AccelClearedHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellRendererAccel(ProxyFactory.get(source)), pathString.getUtf8String(0));
    }
    
    public static void signalCellRendererAccelAccelEdited(MemoryAddress source, MemoryAddress pathString, int accelKey, int accelMods, int hardwareKeycode, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRendererAccel.AccelEditedHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellRendererAccel(ProxyFactory.get(source)), pathString.getUtf8String(0), accelKey, accelMods, hardwareKeycode);
    }
    
    public static void signalTreeViewColumnClicked(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeViewColumn.ClickedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeViewColumn(ProxyFactory.get(source)));
    }
    
    public static void signalAssistantApply(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Assistant.ApplyHandler) signalRegistry.get(hash);
        handler.signalReceived(new Assistant(ProxyFactory.get(source)));
    }
    
    public static void signalAssistantCancel(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Assistant.CancelHandler) signalRegistry.get(hash);
        handler.signalReceived(new Assistant(ProxyFactory.get(source)));
    }
    
    public static void signalAssistantClose(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Assistant.CloseHandler) signalRegistry.get(hash);
        handler.signalReceived(new Assistant(ProxyFactory.get(source)));
    }
    
    public static void signalAssistantEscape(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Assistant.EscapeHandler) signalRegistry.get(hash);
        handler.signalReceived(new Assistant(ProxyFactory.get(source)));
    }
    
    public static void signalAssistantPrepare(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Assistant.PrepareHandler) signalRegistry.get(hash);
        handler.signalReceived(new Assistant(ProxyFactory.get(source)), new Widget(ProxyFactory.get(page, false)));
    }
    
    public static boolean signalOverlayGetChildPosition(MemoryAddress source, MemoryAddress widget, MemoryAddress allocation, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Overlay.GetChildPositionHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Overlay(ProxyFactory.get(source)), new Widget(ProxyFactory.get(widget, false)), new org.gtk.gdk.Rectangle(ProxyFactory.get(allocation, false)));
    }
    
    public static void signalComboBoxActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new ComboBox(ProxyFactory.get(source)));
    }
    
    public static void signalComboBoxChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ComboBox(ProxyFactory.get(source)));
    }
    
    public static void signalComboBoxFormatEntryText(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.FormatEntryTextHandler) signalRegistry.get(hash);
        handler.signalReceived(new ComboBox(ProxyFactory.get(source)), path.getUtf8String(0));
    }
    
    public static void signalComboBoxMoveActive(MemoryAddress source, int scrollType, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.MoveActiveHandler) signalRegistry.get(hash);
        handler.signalReceived(new ComboBox(ProxyFactory.get(source)), ScrollType.fromValue(scrollType));
    }
    
    public static boolean signalComboBoxPopdown(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.PopdownHandler) signalRegistry.get(hash);
        return handler.signalReceived(new ComboBox(ProxyFactory.get(source)));
    }
    
    public static void signalComboBoxPopup(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.PopupHandler) signalRegistry.get(hash);
        handler.signalReceived(new ComboBox(ProxyFactory.get(source)));
    }
    
    public static void signalGestureZoomScaleChanged(MemoryAddress source, double scale, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureZoom.ScaleChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureZoom(ProxyFactory.get(source)), scale);
    }
    
    public static void signalListBoxActivateCursorRow(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.ActivateCursorRowHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListBox(ProxyFactory.get(source)));
    }
    
    public static void signalListBoxMoveCursor(MemoryAddress source, int object, int p0, boolean p1, boolean p2, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.MoveCursorHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListBox(ProxyFactory.get(source)), MovementStep.fromValue(object), p0, p1, p2);
    }
    
    public static void signalListBoxRowActivated(MemoryAddress source, MemoryAddress row, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.RowActivatedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListBox(ProxyFactory.get(source)), new ListBoxRow(ProxyFactory.get(row, false)));
    }
    
    public static void signalListBoxRowSelected(MemoryAddress source, MemoryAddress row, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.RowSelectedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListBox(ProxyFactory.get(source)), new ListBoxRow(ProxyFactory.get(row, false)));
    }
    
    public static void signalListBoxSelectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.SelectAllHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListBox(ProxyFactory.get(source)));
    }
    
    public static void signalListBoxSelectedRowsChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.SelectedRowsChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListBox(ProxyFactory.get(source)));
    }
    
    public static void signalListBoxToggleCursorRow(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.ToggleCursorRowHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListBox(ProxyFactory.get(source)));
    }
    
    public static void signalListBoxUnselectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.UnselectAllHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListBox(ProxyFactory.get(source)));
    }
    
    public static void signalFlowBoxChildActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBoxChild.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new FlowBoxChild(ProxyFactory.get(source)));
    }
    
    public static void signalTreeModelRowChanged(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModel.RowChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeModel.TreeModelImpl(ProxyFactory.get(source)), new TreePath(ProxyFactory.get(path, false)), new TreeIter(ProxyFactory.get(iter, false)));
    }
    
    public static void signalTreeModelRowDeleted(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModel.RowDeletedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeModel.TreeModelImpl(ProxyFactory.get(source)), new TreePath(ProxyFactory.get(path, false)));
    }
    
    public static void signalTreeModelRowHasChildToggled(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModel.RowHasChildToggledHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeModel.TreeModelImpl(ProxyFactory.get(source)), new TreePath(ProxyFactory.get(path, false)), new TreeIter(ProxyFactory.get(iter, false)));
    }
    
    public static void signalTreeModelRowInserted(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModel.RowInsertedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeModel.TreeModelImpl(ProxyFactory.get(source)), new TreePath(ProxyFactory.get(path, false)), new TreeIter(ProxyFactory.get(iter, false)));
    }
    
    public static void signalTreeModelRowsReordered(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress newOrder, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModel.RowsReorderedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeModel.TreeModelImpl(ProxyFactory.get(source)), new TreePath(ProxyFactory.get(path, false)), new TreeIter(ProxyFactory.get(iter, false)), newOrder);
    }
    
    public static void signalDropDownActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropDown.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new DropDown(ProxyFactory.get(source)));
    }
    
    public static void signalSearchEntryActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(ProxyFactory.get(source)));
    }
    
    public static void signalSearchEntryNextMatch(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.NextMatchHandler) signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(ProxyFactory.get(source)));
    }
    
    public static void signalSearchEntryPreviousMatch(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.PreviousMatchHandler) signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(ProxyFactory.get(source)));
    }
    
    public static void signalSearchEntrySearchChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.SearchChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(ProxyFactory.get(source)));
    }
    
    public static void signalSearchEntrySearchStarted(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.SearchStartedHandler) signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(ProxyFactory.get(source)));
    }
    
    public static void signalSearchEntryStopSearch(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.StopSearchHandler) signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(ProxyFactory.get(source)));
    }
    
    public static void signalWindowActivateDefault(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Window.ActivateDefaultHandler) signalRegistry.get(hash);
        handler.signalReceived(new Window(ProxyFactory.get(source)));
    }
    
    public static void signalWindowActivateFocus(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Window.ActivateFocusHandler) signalRegistry.get(hash);
        handler.signalReceived(new Window(ProxyFactory.get(source)));
    }
    
    public static boolean signalWindowCloseRequest(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Window.CloseRequestHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Window(ProxyFactory.get(source)));
    }
    
    public static boolean signalWindowEnableDebugging(MemoryAddress source, boolean toggle, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Window.EnableDebuggingHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Window(ProxyFactory.get(source)), toggle);
    }
    
    public static void signalWindowKeysChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Window.KeysChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Window(ProxyFactory.get(source)));
    }
    
    public static void signalGLAreaCreateContext(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GLArea.CreateContextHandler) signalRegistry.get(hash);
        handler.signalReceived(new GLArea(ProxyFactory.get(source)));
    }
    
    public static boolean signalGLAreaRender(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GLArea.RenderHandler) signalRegistry.get(hash);
        return handler.signalReceived(new GLArea(ProxyFactory.get(source)), new org.gtk.gdk.GLContext(ProxyFactory.get(context, false)));
    }
    
    public static void signalGLAreaResize(MemoryAddress source, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GLArea.ResizeHandler) signalRegistry.get(hash);
        handler.signalReceived(new GLArea(ProxyFactory.get(source)), width, height);
    }
    
    public static void signalCalendarDaySelected(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Calendar.DaySelectedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Calendar(ProxyFactory.get(source)));
    }
    
    public static void signalCalendarNextMonth(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Calendar.NextMonthHandler) signalRegistry.get(hash);
        handler.signalReceived(new Calendar(ProxyFactory.get(source)));
    }
    
    public static void signalCalendarNextYear(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Calendar.NextYearHandler) signalRegistry.get(hash);
        handler.signalReceived(new Calendar(ProxyFactory.get(source)));
    }
    
    public static void signalCalendarPrevMonth(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Calendar.PrevMonthHandler) signalRegistry.get(hash);
        handler.signalReceived(new Calendar(ProxyFactory.get(source)));
    }
    
    public static void signalCalendarPrevYear(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Calendar.PrevYearHandler) signalRegistry.get(hash);
        handler.signalReceived(new Calendar(ProxyFactory.get(source)));
    }
    
    public static void signalColumnViewActivate(MemoryAddress source, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ColumnView.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new ColumnView(ProxyFactory.get(source)), position);
    }
    
    public static void signalCheckButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CheckButton.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new CheckButton(ProxyFactory.get(source)));
    }
    
    public static void signalCheckButtonToggled(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CheckButton.ToggledHandler) signalRegistry.get(hash);
        handler.signalReceived(new CheckButton(ProxyFactory.get(source)));
    }
    
    public static boolean signalEventControllerLegacyEvent(MemoryAddress source, MemoryAddress event, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerLegacy.EventHandler) signalRegistry.get(hash);
        return handler.signalReceived(new EventControllerLegacy(ProxyFactory.get(source)), new org.gtk.gdk.Event(ProxyFactory.get(event, false)));
    }
    
    public static void signalLabelActivateCurrentLink(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Label.ActivateCurrentLinkHandler) signalRegistry.get(hash);
        handler.signalReceived(new Label(ProxyFactory.get(source)));
    }
    
    public static boolean signalLabelActivateLink(MemoryAddress source, MemoryAddress uri, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Label.ActivateLinkHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Label(ProxyFactory.get(source)), uri.getUtf8String(0));
    }
    
    public static void signalLabelCopyClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Label.CopyClipboardHandler) signalRegistry.get(hash);
        handler.signalReceived(new Label(ProxyFactory.get(source)));
    }
    
    public static void signalLabelMoveCursor(MemoryAddress source, int step, int count, boolean extendSelection, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Label.MoveCursorHandler) signalRegistry.get(hash);
        handler.signalReceived(new Label(ProxyFactory.get(source)), MovementStep.fromValue(step), count, extendSelection);
    }
    
    public static void signalStyleProviderGtkPrivateChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (StyleProvider.GtkPrivateChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new StyleProvider.StyleProviderImpl(ProxyFactory.get(source)));
    }
    
    public static void signalLevelBarOffsetChanged(MemoryAddress source, MemoryAddress name, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (LevelBar.OffsetChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new LevelBar(ProxyFactory.get(source)), name.getUtf8String(0));
    }
    
    public static void signalStatusbarTextPopped(MemoryAddress source, int contextId, MemoryAddress text, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Statusbar.TextPoppedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Statusbar(ProxyFactory.get(source)), contextId, text.getUtf8String(0));
    }
    
    public static void signalStatusbarTextPushed(MemoryAddress source, int contextId, MemoryAddress text, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Statusbar.TextPushedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Statusbar(ProxyFactory.get(source)), contextId, text.getUtf8String(0));
    }
    
    public static void signalATContextStateChange(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ATContext.StateChangeHandler) signalRegistry.get(hash);
        handler.signalReceived(new ATContext(ProxyFactory.get(source)));
    }
    
    public static void signalTreeSortableSortColumnChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeSortable.SortColumnChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeSortable.TreeSortableImpl(ProxyFactory.get(source)));
    }
    
    public static void signalNativeDialogResponse(MemoryAddress source, int responseId, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (NativeDialog.ResponseHandler) signalRegistry.get(hash);
        handler.signalReceived(new NativeDialog(ProxyFactory.get(source)), responseId);
    }
    
    public static void signalFilterChanged(MemoryAddress source, int change, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Filter.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Filter(ProxyFactory.get(source)), FilterChange.fromValue(change));
    }
    
    public static void signalCellEditableEditingDone(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellEditable.EditingDoneHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellEditable.CellEditableImpl(ProxyFactory.get(source)));
    }
    
    public static void signalCellEditableRemoveWidget(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellEditable.RemoveWidgetHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellEditable.CellEditableImpl(ProxyFactory.get(source)));
    }
    
    public static void signalSignalListItemFactoryBind(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalListItemFactory.BindHandler) signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(ProxyFactory.get(source)), new ListItem(ProxyFactory.get(listitem, false)));
    }
    
    public static void signalSignalListItemFactorySetup(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalListItemFactory.SetupHandler) signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(ProxyFactory.get(source)), new ListItem(ProxyFactory.get(listitem, false)));
    }
    
    public static void signalSignalListItemFactoryTeardown(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalListItemFactory.TeardownHandler) signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(ProxyFactory.get(source)), new ListItem(ProxyFactory.get(listitem, false)));
    }
    
    public static void signalSignalListItemFactoryUnbind(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalListItemFactory.UnbindHandler) signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(ProxyFactory.get(source)), new ListItem(ProxyFactory.get(listitem, false)));
    }
    
    public static boolean signalAboutDialogActivateLink(MemoryAddress source, MemoryAddress uri, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AboutDialog.ActivateLinkHandler) signalRegistry.get(hash);
        return handler.signalReceived(new AboutDialog(ProxyFactory.get(source)), uri.getUtf8String(0));
    }
    
    public static void signalTreeSelectionChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeSelection.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TreeSelection(ProxyFactory.get(source)));
    }
    
    public static void signalSwitchActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Switch.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new Switch(ProxyFactory.get(source)));
    }
    
    public static boolean signalSwitchStateSet(MemoryAddress source, boolean state, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Switch.StateSetHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Switch(ProxyFactory.get(source)), state);
    }
    
    public static void signalIconThemeChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconTheme.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new IconTheme(ProxyFactory.get(source)));
    }
    
    public static void signalInfoBarClose(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (InfoBar.CloseHandler) signalRegistry.get(hash);
        handler.signalReceived(new InfoBar(ProxyFactory.get(source)));
    }
    
    public static void signalInfoBarResponse(MemoryAddress source, int responseId, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (InfoBar.ResponseHandler) signalRegistry.get(hash);
        handler.signalReceived(new InfoBar(ProxyFactory.get(source)), responseId);
    }
    
    public static void signalEventControllerScrollDecelerate(MemoryAddress source, double velX, double velY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerScroll.DecelerateHandler) signalRegistry.get(hash);
        handler.signalReceived(new EventControllerScroll(ProxyFactory.get(source)), velX, velY);
    }
    
    public static boolean signalEventControllerScrollScroll(MemoryAddress source, double dx, double dy, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerScroll.ScrollHandler) signalRegistry.get(hash);
        return handler.signalReceived(new EventControllerScroll(ProxyFactory.get(source)), dx, dy);
    }
    
    public static void signalEventControllerScrollScrollBegin(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerScroll.ScrollBeginHandler) signalRegistry.get(hash);
        handler.signalReceived(new EventControllerScroll(ProxyFactory.get(source)));
    }
    
    public static void signalEventControllerScrollScrollEnd(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerScroll.ScrollEndHandler) signalRegistry.get(hash);
        handler.signalReceived(new EventControllerScroll(ProxyFactory.get(source)));
    }
    
    public static void signalTextTagTableTagAdded(MemoryAddress source, MemoryAddress tag, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextTagTable.TagAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextTagTable(ProxyFactory.get(source)), new TextTag(ProxyFactory.get(tag, false)));
    }
    
    public static void signalTextTagTableTagChanged(MemoryAddress source, MemoryAddress tag, boolean sizeChanged, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextTagTable.TagChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextTagTable(ProxyFactory.get(source)), new TextTag(ProxyFactory.get(tag, false)), sizeChanged);
    }
    
    public static void signalTextTagTableTagRemoved(MemoryAddress source, MemoryAddress tag, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextTagTable.TagRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextTagTable(ProxyFactory.get(source)), new TextTag(ProxyFactory.get(tag, false)));
    }
    
    public static void signalGestureDragDragBegin(MemoryAddress source, double startX, double startY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureDrag.DragBeginHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureDrag(ProxyFactory.get(source)), startX, startY);
    }
    
    public static void signalGestureDragDragEnd(MemoryAddress source, double offsetX, double offsetY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureDrag.DragEndHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureDrag(ProxyFactory.get(source)), offsetX, offsetY);
    }
    
    public static void signalGestureDragDragUpdate(MemoryAddress source, double offsetX, double offsetY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureDrag.DragUpdateHandler) signalRegistry.get(hash);
        handler.signalReceived(new GestureDrag(ProxyFactory.get(source)), offsetX, offsetY);
    }
    
    public static void signalCellRendererEditingCanceled(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRenderer.EditingCanceledHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellRenderer(ProxyFactory.get(source)));
    }
    
    public static void signalCellRendererEditingStarted(MemoryAddress source, MemoryAddress editable, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRenderer.EditingStartedHandler) signalRegistry.get(hash);
        handler.signalReceived(new CellRenderer(ProxyFactory.get(source)), new CellEditable.CellEditableImpl(ProxyFactory.get(editable, false)), path.getUtf8String(0));
    }
    
    public static void signalPrinterDetailsAcquired(MemoryAddress source, boolean success, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Printer.DetailsAcquiredHandler) signalRegistry.get(hash);
        handler.signalReceived(new Printer(ProxyFactory.get(source)), success);
    }
    
    public static void signalGestureBegin(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Gesture.BeginHandler) signalRegistry.get(hash);
        handler.signalReceived(new Gesture(ProxyFactory.get(source)), new org.gtk.gdk.EventSequence(ProxyFactory.get(sequence, false)));
    }
    
    public static void signalGestureCancel(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Gesture.CancelHandler) signalRegistry.get(hash);
        handler.signalReceived(new Gesture(ProxyFactory.get(source)), new org.gtk.gdk.EventSequence(ProxyFactory.get(sequence, false)));
    }
    
    public static void signalGestureEnd(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Gesture.EndHandler) signalRegistry.get(hash);
        handler.signalReceived(new Gesture(ProxyFactory.get(source)), new org.gtk.gdk.EventSequence(ProxyFactory.get(sequence, false)));
    }
    
    public static void signalGestureSequenceStateChanged(MemoryAddress source, MemoryAddress sequence, int state, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Gesture.SequenceStateChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Gesture(ProxyFactory.get(source)), new org.gtk.gdk.EventSequence(ProxyFactory.get(sequence, false)), EventSequenceState.fromValue(state));
    }
    
    public static void signalGestureUpdate(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Gesture.UpdateHandler) signalRegistry.get(hash);
        handler.signalReceived(new Gesture(ProxyFactory.get(source)), new org.gtk.gdk.EventSequence(ProxyFactory.get(sequence, false)));
    }
    
    public static void signalPrintJobStatusChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintJob.StatusChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new PrintJob(ProxyFactory.get(source)));
    }
    
    public static boolean signalDropTargetAccept(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.AcceptHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DropTarget(ProxyFactory.get(source)), new org.gtk.gdk.Drop(ProxyFactory.get(drop, false)));
    }
    
    public static boolean signalDropTargetDrop(MemoryAddress source, MemoryAddress value, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.DropHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DropTarget(ProxyFactory.get(source)), new org.gtk.gobject.Value(ProxyFactory.get(value, false)), x, y);
    }
    
    public static void signalDropTargetEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.EnterHandler) signalRegistry.get(hash);
        handler.signalReceived(new DropTarget(ProxyFactory.get(source)), x, y);
    }
    
    public static void signalDropTargetLeave(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.LeaveHandler) signalRegistry.get(hash);
        handler.signalReceived(new DropTarget(ProxyFactory.get(source)));
    }
    
    public static void signalDropTargetMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.MotionHandler) signalRegistry.get(hash);
        handler.signalReceived(new DropTarget(ProxyFactory.get(source)), x, y);
    }
    
    public static boolean signalLinkButtonActivateLink(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (LinkButton.ActivateLinkHandler) signalRegistry.get(hash);
        return handler.signalReceived(new LinkButton(ProxyFactory.get(source)));
    }
    
    public static void signalEventControllerKeyImUpdate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerKey.ImUpdateHandler) signalRegistry.get(hash);
        handler.signalReceived(new EventControllerKey(ProxyFactory.get(source)));
    }
    
    public static boolean signalEventControllerKeyKeyPressed(MemoryAddress source, int keyval, int keycode, int state, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerKey.KeyPressedHandler) signalRegistry.get(hash);
        return handler.signalReceived(new EventControllerKey(ProxyFactory.get(source)), keyval, keycode, state);
    }
    
    public static void signalEventControllerKeyKeyReleased(MemoryAddress source, int keyval, int keycode, int state, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerKey.KeyReleasedHandler) signalRegistry.get(hash);
        handler.signalReceived(new EventControllerKey(ProxyFactory.get(source)), keyval, keycode, state);
    }
    
    public static boolean signalEventControllerKeyModifiers(MemoryAddress source, int keyval, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerKey.ModifiersHandler) signalRegistry.get(hash);
        return handler.signalReceived(new EventControllerKey(ProxyFactory.get(source)), keyval);
    }
    
    public static void signalTextBufferApplyTag(MemoryAddress source, MemoryAddress tag, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.ApplyTagHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)), new TextTag(ProxyFactory.get(tag, false)), new TextIter(ProxyFactory.get(start, false)), new TextIter(ProxyFactory.get(end, false)));
    }
    
    public static void signalTextBufferBeginUserAction(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.BeginUserActionHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)));
    }
    
    public static void signalTextBufferChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)));
    }
    
    public static void signalTextBufferDeleteRange(MemoryAddress source, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.DeleteRangeHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)), new TextIter(ProxyFactory.get(start, false)), new TextIter(ProxyFactory.get(end, false)));
    }
    
    public static void signalTextBufferEndUserAction(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.EndUserActionHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)));
    }
    
    public static void signalTextBufferInsertChildAnchor(MemoryAddress source, MemoryAddress location, MemoryAddress anchor, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.InsertChildAnchorHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)), new TextIter(ProxyFactory.get(location, false)), new TextChildAnchor(ProxyFactory.get(anchor, false)));
    }
    
    public static void signalTextBufferInsertPaintable(MemoryAddress source, MemoryAddress location, MemoryAddress paintable, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.InsertPaintableHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)), new TextIter(ProxyFactory.get(location, false)), new org.gtk.gdk.Paintable.PaintableImpl(ProxyFactory.get(paintable, false)));
    }
    
    public static void signalTextBufferInsertText(MemoryAddress source, MemoryAddress location, MemoryAddress text, int len, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.InsertTextHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)), new TextIter(ProxyFactory.get(location, false)), text.getUtf8String(0), len);
    }
    
    public static void signalTextBufferMarkDeleted(MemoryAddress source, MemoryAddress mark, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.MarkDeletedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)), new TextMark(ProxyFactory.get(mark, false)));
    }
    
    public static void signalTextBufferMarkSet(MemoryAddress source, MemoryAddress location, MemoryAddress mark, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.MarkSetHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)), new TextIter(ProxyFactory.get(location, false)), new TextMark(ProxyFactory.get(mark, false)));
    }
    
    public static void signalTextBufferModifiedChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.ModifiedChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)));
    }
    
    public static void signalTextBufferPasteDone(MemoryAddress source, MemoryAddress clipboard, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.PasteDoneHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)), new org.gtk.gdk.Clipboard(ProxyFactory.get(clipboard, false)));
    }
    
    public static void signalTextBufferRedo(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.RedoHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)));
    }
    
    public static void signalTextBufferRemoveTag(MemoryAddress source, MemoryAddress tag, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.RemoveTagHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)), new TextTag(ProxyFactory.get(tag, false)), new TextIter(ProxyFactory.get(start, false)), new TextIter(ProxyFactory.get(end, false)));
    }
    
    public static void signalTextBufferUndo(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.UndoHandler) signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(ProxyFactory.get(source)));
    }
    
    public static boolean signalNotebookChangeCurrentPage(MemoryAddress source, int object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.ChangeCurrentPageHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Notebook(ProxyFactory.get(source)), object);
    }
    
    public static void signalNotebookCreateWindow(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.CreateWindowHandler) signalRegistry.get(hash);
        handler.signalReceived(new Notebook(ProxyFactory.get(source)), new Widget(ProxyFactory.get(page, false)));
    }
    
    public static boolean signalNotebookFocusTab(MemoryAddress source, int object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.FocusTabHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Notebook(ProxyFactory.get(source)), NotebookTab.fromValue(object));
    }
    
    public static void signalNotebookMoveFocusOut(MemoryAddress source, int object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.MoveFocusOutHandler) signalRegistry.get(hash);
        handler.signalReceived(new Notebook(ProxyFactory.get(source)), DirectionType.fromValue(object));
    }
    
    public static void signalNotebookPageAdded(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.PageAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Notebook(ProxyFactory.get(source)), new Widget(ProxyFactory.get(child, false)), pageNum);
    }
    
    public static void signalNotebookPageRemoved(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.PageRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Notebook(ProxyFactory.get(source)), new Widget(ProxyFactory.get(child, false)), pageNum);
    }
    
    public static void signalNotebookPageReordered(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.PageReorderedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Notebook(ProxyFactory.get(source)), new Widget(ProxyFactory.get(child, false)), pageNum);
    }
    
    public static boolean signalNotebookReorderTab(MemoryAddress source, int object, boolean p0, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.ReorderTabHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Notebook(ProxyFactory.get(source)), DirectionType.fromValue(object), p0);
    }
    
    public static boolean signalNotebookSelectPage(MemoryAddress source, boolean object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.SelectPageHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Notebook(ProxyFactory.get(source)), object);
    }
    
    public static void signalNotebookSwitchPage(MemoryAddress source, MemoryAddress page, int pageNum, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.SwitchPageHandler) signalRegistry.get(hash);
        handler.signalReceived(new Notebook(ProxyFactory.get(source)), new Widget(ProxyFactory.get(page, false)), pageNum);
    }
    
    public static void signalEventControllerFocusEnter(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerFocus.EnterHandler) signalRegistry.get(hash);
        handler.signalReceived(new EventControllerFocus(ProxyFactory.get(source)));
    }
    
    public static void signalEventControllerFocusLeave(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerFocus.LeaveHandler) signalRegistry.get(hash);
        handler.signalReceived(new EventControllerFocus(ProxyFactory.get(source)));
    }
    
}

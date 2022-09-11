package org.gtk.gtk;

import jdk.incubator.foreign.*;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static int cbAssistantPageFunc(int currentPage, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AssistantPageFunc) Interop.signalRegistry.get(hash);
        return handler.onAssistantPageFunc(currentPage);
    }
    
    public static void signalWidgetDestroy(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.DestroyHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Widget(References.get(source)));
    }
    
    public static void signalWidgetDirectionChanged(MemoryAddress source, int previousDirection, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.DirectionChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Widget(References.get(source)), TextDirection.fromValue(previousDirection));
    }
    
    public static void signalWidgetHide(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.HideHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Widget(References.get(source)));
    }
    
    public static boolean signalWidgetKeynavFailed(MemoryAddress source, int direction, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.KeynavFailedHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Widget(References.get(source)), DirectionType.fromValue(direction));
    }
    
    public static void signalWidgetMap(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.MapHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Widget(References.get(source)));
    }
    
    public static boolean signalWidgetMnemonicActivate(MemoryAddress source, boolean groupCycling, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.MnemonicActivateHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Widget(References.get(source)), groupCycling);
    }
    
    public static void signalWidgetMoveFocus(MemoryAddress source, int direction, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.MoveFocusHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Widget(References.get(source)), DirectionType.fromValue(direction));
    }
    
    public static boolean signalWidgetQueryTooltip(MemoryAddress source, int x, int y, boolean keyboardMode, MemoryAddress tooltip, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.QueryTooltipHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Widget(References.get(source)), x, y, keyboardMode, new Tooltip(References.get(tooltip, false)));
    }
    
    public static void signalWidgetRealize(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.RealizeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Widget(References.get(source)));
    }
    
    public static void signalWidgetShow(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.ShowHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Widget(References.get(source)));
    }
    
    public static void signalWidgetStateFlagsChanged(MemoryAddress source, int flags, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.StateFlagsChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Widget(References.get(source)), flags);
    }
    
    public static void signalWidgetUnmap(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.UnmapHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Widget(References.get(source)));
    }
    
    public static void signalWidgetUnrealize(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Widget.UnrealizeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Widget(References.get(source)));
    }
    
    public static boolean cbEntryCompletionMatchFunc(MemoryAddress completion, MemoryAddress key, MemoryAddress iter, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (EntryCompletionMatchFunc) Interop.signalRegistry.get(hash);
        return handler.onEntryCompletionMatchFunc(new EntryCompletion(References.get(completion, false)), key.getUtf8String(0), new TreeIter(References.get(iter, false)));
    }
    
    public static void signalCellAreaAddEditable(MemoryAddress source, MemoryAddress renderer, MemoryAddress editable, MemoryAddress cellArea, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellArea.AddEditableHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellArea(References.get(source)), new CellRenderer(References.get(renderer, false)), new CellEditable.CellEditableImpl(References.get(editable, false)), new org.gtk.gdk.Rectangle(References.get(cellArea, false)), path.getUtf8String(0));
    }
    
    public static void signalCellAreaApplyAttributes(MemoryAddress source, MemoryAddress model, MemoryAddress iter, boolean isExpander, boolean isExpanded, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellArea.ApplyAttributesHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellArea(References.get(source)), new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)), isExpander, isExpanded);
    }
    
    public static void signalCellAreaFocusChanged(MemoryAddress source, MemoryAddress renderer, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellArea.FocusChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellArea(References.get(source)), new CellRenderer(References.get(renderer, false)), path.getUtf8String(0));
    }
    
    public static void signalCellAreaRemoveEditable(MemoryAddress source, MemoryAddress renderer, MemoryAddress editable, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellArea.RemoveEditableHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellArea(References.get(source)), new CellRenderer(References.get(renderer, false)), new CellEditable.CellEditableImpl(References.get(editable, false)));
    }
    
    public static void signalFlowBoxActivateCursorChild(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.ActivateCursorChildHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(References.get(source)));
    }
    
    public static void signalFlowBoxChildActivated(MemoryAddress source, MemoryAddress child, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.ChildActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(References.get(source)), new FlowBoxChild(References.get(child, false)));
    }
    
    public static boolean signalFlowBoxMoveCursor(MemoryAddress source, int step, int count, boolean extend, boolean modify, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.MoveCursorHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new FlowBox(References.get(source)), MovementStep.fromValue(step), count, extend, modify);
    }
    
    public static void signalFlowBoxSelectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.SelectAllHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(References.get(source)));
    }
    
    public static void signalFlowBoxSelectedChildrenChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.SelectedChildrenChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(References.get(source)));
    }
    
    public static void signalFlowBoxToggleCursorChild(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.ToggleCursorChildHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(References.get(source)));
    }
    
    public static void signalFlowBoxUnselectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBox.UnselectAllHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FlowBox(References.get(source)));
    }
    
    public static void signalButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Button.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Button(References.get(source)));
    }
    
    public static void signalButtonClicked(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Button.ClickedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Button(References.get(source)));
    }
    
    public static void signalFontChooserFontActivated(MemoryAddress source, MemoryAddress fontname, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FontChooser.FontActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FontChooser.FontChooserImpl(References.get(source)), fontname.getUtf8String(0));
    }
    
    public static boolean signalShortcutsSectionChangeCurrentPage(MemoryAddress source, int object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ShortcutsSection.ChangeCurrentPageHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new ShortcutsSection(References.get(source)), object);
    }
    
    public static void cbMenuButtonCreatePopupFunc(MemoryAddress menuButton, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (MenuButtonCreatePopupFunc) Interop.signalRegistry.get(hash);
        handler.onMenuButtonCreatePopupFunc(new MenuButton(References.get(menuButton, false)));
    }
    
    public static void signalShortcutsWindowClose(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ShortcutsWindow.CloseHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ShortcutsWindow(References.get(source)));
    }
    
    public static void signalShortcutsWindowSearch(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ShortcutsWindow.SearchHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ShortcutsWindow(References.get(source)));
    }
    
    public static void cbExpressionNotify(MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ExpressionNotify) Interop.signalRegistry.get(hash);
        handler.onExpressionNotify();
    }
    
    public static void signalEntryActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Entry.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Entry(References.get(source)));
    }
    
    public static void signalEntryIconPress(MemoryAddress source, int iconPos, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Entry.IconPressHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Entry(References.get(source)), EntryIconPosition.fromValue(iconPos));
    }
    
    public static void signalEntryIconRelease(MemoryAddress source, int iconPos, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Entry.IconReleaseHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Entry(References.get(source)), EntryIconPosition.fromValue(iconPos));
    }
    
    public static void signalRecentManagerChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (RecentManager.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new RecentManager(References.get(source)));
    }
    
    public static void signalCssProviderParsingError(MemoryAddress source, MemoryAddress section, MemoryAddress error, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CssProvider.ParsingErrorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CssProvider(References.get(source)), new CssSection(References.get(section, false)), new org.gtk.glib.Error(References.get(error, false)));
    }
    
    public static void signalToggleButtonToggled(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ToggleButton.ToggledHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ToggleButton(References.get(source)));
    }
    
    public static void signalDragSourceDragBegin(MemoryAddress source, MemoryAddress drag, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DragSource.DragBeginHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DragSource(References.get(source)), new org.gtk.gdk.Drag(References.get(drag, false)));
    }
    
    public static boolean signalDragSourceDragCancel(MemoryAddress source, MemoryAddress drag, int reason, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DragSource.DragCancelHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DragSource(References.get(source)), new org.gtk.gdk.Drag(References.get(drag, false)), org.gtk.gdk.DragCancelReason.fromValue(reason));
    }
    
    public static void signalDragSourceDragEnd(MemoryAddress source, MemoryAddress drag, boolean deleteData, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DragSource.DragEndHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DragSource(References.get(source)), new org.gtk.gdk.Drag(References.get(drag, false)), deleteData);
    }
    
    public static void signalDragSourcePrepare(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DragSource.PrepareHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DragSource(References.get(source)), x, y);
    }
    
    public static void signalFileChooserWidgetDesktopFolder(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.DesktopFolderHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)));
    }
    
    public static void signalFileChooserWidgetDownFolder(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.DownFolderHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)));
    }
    
    public static void signalFileChooserWidgetHomeFolder(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.HomeFolderHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)));
    }
    
    public static void signalFileChooserWidgetLocationPopup(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.LocationPopupHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)), path.getUtf8String(0));
    }
    
    public static void signalFileChooserWidgetLocationPopupOnPaste(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.LocationPopupOnPasteHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)));
    }
    
    public static void signalFileChooserWidgetLocationTogglePopup(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.LocationTogglePopupHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)));
    }
    
    public static void signalFileChooserWidgetPlacesShortcut(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.PlacesShortcutHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)));
    }
    
    public static void signalFileChooserWidgetQuickBookmark(MemoryAddress source, int bookmarkIndex, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.QuickBookmarkHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)), bookmarkIndex);
    }
    
    public static void signalFileChooserWidgetRecentShortcut(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.RecentShortcutHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)));
    }
    
    public static void signalFileChooserWidgetSearchShortcut(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.SearchShortcutHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)));
    }
    
    public static void signalFileChooserWidgetShowHidden(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.ShowHiddenHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)));
    }
    
    public static void signalFileChooserWidgetUpFolder(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileChooserWidget.UpFolderHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileChooserWidget(References.get(source)));
    }
    
    public static Widget cbFlowBoxCreateWidgetFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FlowBoxCreateWidgetFunc) Interop.signalRegistry.get(hash);
        return handler.onFlowBoxCreateWidgetFunc(new org.gtk.gobject.Object(References.get(item, false)));
    }
    
    public static void signalListViewActivate(MemoryAddress source, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListView.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListView(References.get(source)), position);
    }
    
    public static void signalDialogClose(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Dialog.CloseHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Dialog(References.get(source)));
    }
    
    public static void signalDialogResponse(MemoryAddress source, int responseId, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Dialog.ResponseHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Dialog(References.get(source)), responseId);
    }
    
    public static void cbFlowBoxForeachFunc(MemoryAddress box, MemoryAddress child, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FlowBoxForeachFunc) Interop.signalRegistry.get(hash);
        handler.onFlowBoxForeachFunc(new FlowBox(References.get(box, false)), new FlowBoxChild(References.get(child, false)));
    }
    
    public static void signalFontButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FontButton.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FontButton(References.get(source)));
    }
    
    public static void signalFontButtonFontSet(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FontButton.FontSetHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FontButton(References.get(source)));
    }
    
    public static void signalExpanderActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Expander.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Expander(References.get(source)));
    }
    
    public static java.lang.String cbScaleFormatValueFunc(MemoryAddress scale, double value, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ScaleFormatValueFunc) Interop.signalRegistry.get(hash);
        return handler.onScaleFormatValueFunc(new Scale(References.get(scale, false)), value);
    }
    
    public static void signalScrolledWindowEdgeOvershot(MemoryAddress source, int pos, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScrolledWindow.EdgeOvershotHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ScrolledWindow(References.get(source)), PositionType.fromValue(pos));
    }
    
    public static void signalScrolledWindowEdgeReached(MemoryAddress source, int pos, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScrolledWindow.EdgeReachedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ScrolledWindow(References.get(source)), PositionType.fromValue(pos));
    }
    
    public static void signalScrolledWindowMoveFocusOut(MemoryAddress source, int directionType, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScrolledWindow.MoveFocusOutHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ScrolledWindow(References.get(source)), DirectionType.fromValue(directionType));
    }
    
    public static boolean signalScrolledWindowScrollChild(MemoryAddress source, int scroll, boolean horizontal, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScrolledWindow.ScrollChildHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new ScrolledWindow(References.get(source)), ScrollType.fromValue(scroll), horizontal);
    }
    
    public static void signalPrintOperationBeginPrint(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.BeginPrintHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(References.get(source)), new PrintContext(References.get(context, false)));
    }
    
    public static void signalPrintOperationCreateCustomWidget(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.CreateCustomWidgetHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(References.get(source)));
    }
    
    public static void signalPrintOperationCustomWidgetApply(MemoryAddress source, MemoryAddress widget, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.CustomWidgetApplyHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(References.get(source)), new Widget(References.get(widget, false)));
    }
    
    public static void signalPrintOperationDone(MemoryAddress source, int result, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.DoneHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(References.get(source)), PrintOperationResult.fromValue(result));
    }
    
    public static void signalPrintOperationDrawPage(MemoryAddress source, MemoryAddress context, int pageNr, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.DrawPageHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(References.get(source)), new PrintContext(References.get(context, false)), pageNr);
    }
    
    public static void signalPrintOperationEndPrint(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.EndPrintHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(References.get(source)), new PrintContext(References.get(context, false)));
    }
    
    public static boolean signalPrintOperationPaginate(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.PaginateHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new PrintOperation(References.get(source)), new PrintContext(References.get(context, false)));
    }
    
    public static boolean signalPrintOperationPreview(MemoryAddress source, MemoryAddress preview, MemoryAddress context, MemoryAddress parent, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.PreviewHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new PrintOperation(References.get(source)), new PrintOperationPreview.PrintOperationPreviewImpl(References.get(preview, false)), new PrintContext(References.get(context, false)), new Window(References.get(parent, false)));
    }
    
    public static void signalPrintOperationRequestPageSetup(MemoryAddress source, MemoryAddress context, int pageNr, MemoryAddress setup, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.RequestPageSetupHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(References.get(source)), new PrintContext(References.get(context, false)), pageNr, new PageSetup(References.get(setup, false)));
    }
    
    public static void signalPrintOperationStatusChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.StatusChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(References.get(source)));
    }
    
    public static void signalPrintOperationUpdateCustomWidget(MemoryAddress source, MemoryAddress widget, MemoryAddress setup, MemoryAddress settings, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperation.UpdateCustomWidgetHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperation(References.get(source)), new Widget(References.get(widget, false)), new PageSetup(References.get(setup, false)), new PrintSettings(References.get(settings, false)));
    }
    
    public static boolean cbCellCallback(MemoryAddress renderer, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellCallback) Interop.signalRegistry.get(hash);
        return handler.onCellCallback(new CellRenderer(References.get(renderer, false)));
    }
    
    public static void signalAppChooserWidgetApplicationActivated(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppChooserWidget.ApplicationActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppChooserWidget(References.get(source)), new org.gtk.gio.AppInfo.AppInfoImpl(References.get(application, false)));
    }
    
    public static void signalAppChooserWidgetApplicationSelected(MemoryAddress source, MemoryAddress application, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppChooserWidget.ApplicationSelectedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppChooserWidget(References.get(source)), new org.gtk.gio.AppInfo.AppInfoImpl(References.get(application, false)));
    }
    
    public static boolean cbListBoxFilterFunc(MemoryAddress row, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ListBoxFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onListBoxFilterFunc(new ListBoxRow(References.get(row, false)));
    }
    
    public static void signalEventControllerMotionEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerMotion.EnterHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerMotion(References.get(source)), x, y);
    }
    
    public static void signalEventControllerMotionLeave(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerMotion.LeaveHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerMotion(References.get(source)));
    }
    
    public static void signalEventControllerMotionMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerMotion.MotionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerMotion(References.get(source)), x, y);
    }
    
    public static void signalPasswordEntryActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PasswordEntry.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PasswordEntry(References.get(source)));
    }
    
    public static void signalGestureClickPressed(MemoryAddress source, int nPress, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureClick.PressedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureClick(References.get(source)), nPress, x, y);
    }
    
    public static void signalGestureClickReleased(MemoryAddress source, int nPress, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureClick.ReleasedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureClick(References.get(source)), nPress, x, y);
    }
    
    public static void signalGestureClickStopped(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureClick.StoppedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureClick(References.get(source)));
    }
    
    public static void signalGestureClickUnpairedRelease(MemoryAddress source, double x, double y, int button, MemoryAddress sequence, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureClick.UnpairedReleaseHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureClick(References.get(source)), x, y, button, new org.gtk.gdk.EventSequence(References.get(sequence, false)));
    }
    
    public static int cbListBoxSortFunc(MemoryAddress row1, MemoryAddress row2, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ListBoxSortFunc) Interop.signalRegistry.get(hash);
        return handler.onListBoxSortFunc(new ListBoxRow(References.get(row1, false)), new ListBoxRow(References.get(row2, false)));
    }
    
    public static boolean signalIconViewActivateCursorItem(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.ActivateCursorItemHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new IconView(References.get(source)));
    }
    
    public static void signalIconViewItemActivated(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.ItemActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)), new TreePath(References.get(path, false)));
    }
    
    public static boolean signalIconViewMoveCursor(MemoryAddress source, int step, int count, boolean extend, boolean modify, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.MoveCursorHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new IconView(References.get(source)), MovementStep.fromValue(step), count, extend, modify);
    }
    
    public static void signalIconViewSelectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.SelectAllHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)));
    }
    
    public static void signalIconViewSelectCursorItem(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.SelectCursorItemHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)));
    }
    
    public static void signalIconViewSelectionChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.SelectionChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)));
    }
    
    public static void signalIconViewToggleCursorItem(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.ToggleCursorItemHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)));
    }
    
    public static void signalIconViewUnselectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconView.UnselectAllHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)));
    }
    
    public static void signalPrintOperationPreviewGotPageSize(MemoryAddress source, MemoryAddress context, MemoryAddress pageSetup, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperationPreview.GotPageSizeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(References.get(source)), new PrintContext(References.get(context, false)), new PageSetup(References.get(pageSetup, false)));
    }
    
    public static void signalPrintOperationPreviewReady(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintOperationPreview.ReadyHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintOperationPreview.PrintOperationPreviewImpl(References.get(source)), new PrintContext(References.get(context, false)));
    }
    
    public static void cbCellLayoutDataFunc(MemoryAddress cellLayout, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellLayoutDataFunc) Interop.signalRegistry.get(hash);
        handler.onCellLayoutDataFunc(new CellLayout.CellLayoutImpl(References.get(cellLayout, false)), new CellRenderer(References.get(cell, false)), new TreeModel.TreeModelImpl(References.get(treeModel, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static void signalCellRendererTextEdited(MemoryAddress source, MemoryAddress path, MemoryAddress newText, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRendererText.EditedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellRendererText(References.get(source)), path.getUtf8String(0), newText.getUtf8String(0));
    }
    
    public static void signalSorterChanged(MemoryAddress source, int change, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Sorter.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Sorter(References.get(source)), SorterChange.fromValue(change));
    }
    
    public static void signalListBoxRowActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBoxRow.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListBoxRow(References.get(source)));
    }
    
    public static void signalAdjustmentChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Adjustment.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Adjustment(References.get(source)));
    }
    
    public static void signalAdjustmentValueChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Adjustment.ValueChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Adjustment(References.get(source)));
    }
    
    public static void signalAppChooserButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppChooserButton.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppChooserButton(References.get(source)));
    }
    
    public static void signalAppChooserButtonChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppChooserButton.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppChooserButton(References.get(source)));
    }
    
    public static void signalAppChooserButtonCustomItemActivated(MemoryAddress source, MemoryAddress itemName, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppChooserButton.CustomItemActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppChooserButton(References.get(source)), itemName.getUtf8String(0));
    }
    
    public static void cbListBoxForeachFunc(MemoryAddress box, MemoryAddress row, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ListBoxForeachFunc) Interop.signalRegistry.get(hash);
        handler.onListBoxForeachFunc(new ListBox(References.get(box, false)), new ListBoxRow(References.get(row, false)));
    }
    
    public static void signalCellRendererToggleToggled(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRendererToggle.ToggledHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellRendererToggle(References.get(source)), path.getUtf8String(0));
    }
    
    public static Widget cbListBoxCreateWidgetFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ListBoxCreateWidgetFunc) Interop.signalRegistry.get(hash);
        return handler.onListBoxCreateWidgetFunc(new org.gtk.gobject.Object(References.get(item, false)));
    }
    
    public static void signalApplicationQueryEnd(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.QueryEndHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)));
    }
    
    public static void signalApplicationWindowAdded(MemoryAddress source, MemoryAddress window, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.WindowAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)), new Window(References.get(window, false)));
    }
    
    public static void signalApplicationWindowRemoved(MemoryAddress source, MemoryAddress window, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.WindowRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)), new Window(References.get(window, false)));
    }
    
    public static void signalDropControllerMotionEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropControllerMotion.EnterHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropControllerMotion(References.get(source)), x, y);
    }
    
    public static void signalDropControllerMotionLeave(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropControllerMotion.LeaveHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropControllerMotion(References.get(source)));
    }
    
    public static void signalDropControllerMotionMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropControllerMotion.MotionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropControllerMotion(References.get(source)), x, y);
    }
    
    public static void signalPopoverActivateDefault(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Popover.ActivateDefaultHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Popover(References.get(source)));
    }
    
    public static void signalPopoverClosed(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Popover.ClosedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Popover(References.get(source)));
    }
    
    public static void signalGesturePanPan(MemoryAddress source, int direction, double offset, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GesturePan.PanHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GesturePan(References.get(source)), PanDirection.fromValue(direction), offset);
    }
    
    public static boolean signalPanedAcceptPosition(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.AcceptPositionHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Paned(References.get(source)));
    }
    
    public static boolean signalPanedCancelPosition(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.CancelPositionHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Paned(References.get(source)));
    }
    
    public static boolean signalPanedCycleChildFocus(MemoryAddress source, boolean reversed, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.CycleChildFocusHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Paned(References.get(source)), reversed);
    }
    
    public static boolean signalPanedCycleHandleFocus(MemoryAddress source, boolean reversed, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.CycleHandleFocusHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Paned(References.get(source)), reversed);
    }
    
    public static boolean signalPanedMoveHandle(MemoryAddress source, int scrollType, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.MoveHandleHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Paned(References.get(source)), ScrollType.fromValue(scrollType));
    }
    
    public static boolean signalPanedToggleHandleFocus(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Paned.ToggleHandleFocusHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Paned(References.get(source)));
    }
    
    public static void cbTreeViewMappingFunc(MemoryAddress treeView, MemoryAddress path, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TreeViewMappingFunc) Interop.signalRegistry.get(hash);
        handler.onTreeViewMappingFunc(new TreeView(References.get(treeView, false)), new TreePath(References.get(path, false)));
    }
    
    public static void signalGestureStylusDown(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.DownHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(References.get(source)), x, y);
    }
    
    public static void signalGestureStylusMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.MotionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(References.get(source)), x, y);
    }
    
    public static void signalGestureStylusProximity(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.ProximityHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(References.get(source)), x, y);
    }
    
    public static void signalGestureStylusUp(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.UpHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(References.get(source)), x, y);
    }
    
    public static void signalDrawingAreaResize(MemoryAddress source, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DrawingArea.ResizeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DrawingArea(References.get(source)), width, height);
    }
    
    public static void signalColorButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ColorButton.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ColorButton(References.get(source)));
    }
    
    public static void signalColorButtonColorSet(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ColorButton.ColorSetHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ColorButton(References.get(source)));
    }
    
    public static boolean signalEntryCompletionCursorOnMatch(MemoryAddress source, MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryCompletion.CursorOnMatchHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new EntryCompletion(References.get(source)), new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static boolean signalEntryCompletionInsertPrefix(MemoryAddress source, MemoryAddress prefix, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryCompletion.InsertPrefixHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new EntryCompletion(References.get(source)), prefix.getUtf8String(0));
    }
    
    public static boolean signalEntryCompletionMatchSelected(MemoryAddress source, MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryCompletion.MatchSelectedHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new EntryCompletion(References.get(source)), new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static void signalEntryCompletionNoMatches(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryCompletion.NoMatchesHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EntryCompletion(References.get(source)));
    }
    
    public static void signalSpinButtonChangeValue(MemoryAddress source, int scroll, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.ChangeValueHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(References.get(source)), ScrollType.fromValue(scroll));
    }
    
    public static void signalSpinButtonInput(MemoryAddress source, double newValue, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.InputHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(References.get(source)), newValue);
    }
    
    public static boolean signalSpinButtonOutput(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.OutputHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new SpinButton(References.get(source)));
    }
    
    public static void signalSpinButtonValueChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.ValueChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(References.get(source)));
    }
    
    public static void signalSpinButtonWrapped(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SpinButton.WrappedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SpinButton(References.get(source)));
    }
    
    public static void signalScaleButtonPopdown(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScaleButton.PopdownHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ScaleButton(References.get(source)));
    }
    
    public static void signalScaleButtonPopup(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScaleButton.PopupHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ScaleButton(References.get(source)));
    }
    
    public static void signalScaleButtonValueChanged(MemoryAddress source, double value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ScaleButton.ValueChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ScaleButton(References.get(source)), value);
    }
    
    public static void signalTextActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)));
    }
    
    public static void signalTextBackspace(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.BackspaceHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)));
    }
    
    public static void signalTextCopyClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.CopyClipboardHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)));
    }
    
    public static void signalTextCutClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.CutClipboardHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)));
    }
    
    public static void signalTextDeleteFromCursor(MemoryAddress source, int type, int count, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.DeleteFromCursorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)), DeleteType.fromValue(type), count);
    }
    
    public static void signalTextInsertAtCursor(MemoryAddress source, MemoryAddress string, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.InsertAtCursorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)), string.getUtf8String(0));
    }
    
    public static void signalTextInsertEmoji(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.InsertEmojiHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)));
    }
    
    public static void signalTextMoveCursor(MemoryAddress source, int step, int count, boolean extend, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.MoveCursorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)), MovementStep.fromValue(step), count, extend);
    }
    
    public static void signalTextPasteClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.PasteClipboardHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)));
    }
    
    public static void signalTextPreeditChanged(MemoryAddress source, MemoryAddress preedit, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.PreeditChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)), preedit.getUtf8String(0));
    }
    
    public static void signalTextToggleOverwrite(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Text.ToggleOverwriteHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Text(References.get(source)));
    }
    
    public static boolean cbTreeViewColumnDropFunc(MemoryAddress treeView, MemoryAddress column, MemoryAddress prevColumn, MemoryAddress nextColumn, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeViewColumnDropFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeViewColumnDropFunc(new TreeView(References.get(treeView, false)), new TreeViewColumn(References.get(column, false)), new TreeViewColumn(References.get(prevColumn, false)), new TreeViewColumn(References.get(nextColumn, false)));
    }
    
    public static void cbTreeSelectionForeachFunc(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeSelectionForeachFunc) Interop.signalRegistry.get(hash);
        handler.onTreeSelectionForeachFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreePath(References.get(path, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static void signalGestureSwipeSwipe(MemoryAddress source, double velocityX, double velocityY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureSwipe.SwipeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureSwipe(References.get(source)), velocityX, velocityY);
    }
    
    public static void signalCellRendererComboChanged(MemoryAddress source, MemoryAddress pathString, MemoryAddress newIter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRendererCombo.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellRendererCombo(References.get(source)), pathString.getUtf8String(0), new TreeIter(References.get(newIter, false)));
    }
    
    public static int cbFlowBoxSortFunc(MemoryAddress child1, MemoryAddress child2, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FlowBoxSortFunc) Interop.signalRegistry.get(hash);
        return handler.onFlowBoxSortFunc(new FlowBoxChild(References.get(child1, false)), new FlowBoxChild(References.get(child2, false)));
    }
    
    public static boolean cbFontFilterFunc(MemoryAddress family, MemoryAddress face, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FontFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onFontFilterFunc(new org.pango.FontFamily(References.get(family, false)), new org.pango.FontFace(References.get(face, false)));
    }
    
    public static void signalSelectionModelSelectionChanged(MemoryAddress source, int position, int nItems, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SelectionModel.SelectionChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SelectionModel.SelectionModelImpl(References.get(source)), position, nItems);
    }
    
    public static void signalTextViewBackspace(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.BackspaceHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)));
    }
    
    public static void signalTextViewCopyClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.CopyClipboardHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)));
    }
    
    public static void signalTextViewCutClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.CutClipboardHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)));
    }
    
    public static void signalTextViewDeleteFromCursor(MemoryAddress source, int type, int count, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.DeleteFromCursorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)), DeleteType.fromValue(type), count);
    }
    
    public static boolean signalTextViewExtendSelection(MemoryAddress source, int granularity, MemoryAddress location, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.ExtendSelectionHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TextView(References.get(source)), TextExtendSelection.fromValue(granularity), new TextIter(References.get(location, false)), new TextIter(References.get(start, false)), new TextIter(References.get(end, false)));
    }
    
    public static void signalTextViewInsertAtCursor(MemoryAddress source, MemoryAddress string, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.InsertAtCursorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)), string.getUtf8String(0));
    }
    
    public static void signalTextViewInsertEmoji(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.InsertEmojiHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)));
    }
    
    public static void signalTextViewMoveCursor(MemoryAddress source, int step, int count, boolean extendSelection, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.MoveCursorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)), MovementStep.fromValue(step), count, extendSelection);
    }
    
    public static void signalTextViewMoveViewport(MemoryAddress source, int step, int count, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.MoveViewportHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)), ScrollStep.fromValue(step), count);
    }
    
    public static void signalTextViewPasteClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.PasteClipboardHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)));
    }
    
    public static void signalTextViewPreeditChanged(MemoryAddress source, MemoryAddress preedit, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.PreeditChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)), preedit.getUtf8String(0));
    }
    
    public static void signalTextViewSelectAll(MemoryAddress source, boolean select, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.SelectAllHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)), select);
    }
    
    public static void signalTextViewSetAnchor(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.SetAnchorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)));
    }
    
    public static void signalTextViewToggleCursorVisible(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.ToggleCursorVisibleHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)));
    }
    
    public static void signalTextViewToggleOverwrite(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextView.ToggleOverwriteHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextView(References.get(source)));
    }
    
    public static void signalRangeAdjustBounds(MemoryAddress source, double value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Range.AdjustBoundsHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Range(References.get(source)), value);
    }
    
    public static boolean signalRangeChangeValue(MemoryAddress source, int scroll, double value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Range.ChangeValueHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Range(References.get(source)), ScrollType.fromValue(scroll), value);
    }
    
    public static void signalRangeMoveSlider(MemoryAddress source, int step, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Range.MoveSliderHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Range(References.get(source)), ScrollType.fromValue(step));
    }
    
    public static void signalRangeValueChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Range.ValueChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Range(References.get(source)));
    }
    
    public static boolean cbTreeModelForeachFunc(MemoryAddress model, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModelForeachFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeModelForeachFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreePath(References.get(path, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static void signalGestureLongPressCancelled(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureLongPress.CancelledHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureLongPress(References.get(source)));
    }
    
    public static void signalGestureLongPressPressed(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureLongPress.PressedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureLongPress(References.get(source)), x, y);
    }
    
    public static void signalEntryBufferDeletedText(MemoryAddress source, int position, int nChars, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryBuffer.DeletedTextHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EntryBuffer(References.get(source)), position, nChars);
    }
    
    public static void signalEntryBufferInsertedText(MemoryAddress source, int position, MemoryAddress chars, int nChars, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EntryBuffer.InsertedTextHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EntryBuffer(References.get(source)), position, chars.getUtf8String(0), nChars);
    }
    
    public static void signalIMContextCommit(MemoryAddress source, MemoryAddress str, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.CommitHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IMContext(References.get(source)), str.getUtf8String(0));
    }
    
    public static boolean signalIMContextDeleteSurrounding(MemoryAddress source, int offset, int nChars, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.DeleteSurroundingHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new IMContext(References.get(source)), offset, nChars);
    }
    
    public static void signalIMContextPreeditChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.PreeditChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IMContext(References.get(source)));
    }
    
    public static void signalIMContextPreeditEnd(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.PreeditEndHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IMContext(References.get(source)));
    }
    
    public static void signalIMContextPreeditStart(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.PreeditStartHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IMContext(References.get(source)));
    }
    
    public static boolean signalIMContextRetrieveSurrounding(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IMContext.RetrieveSurroundingHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new IMContext(References.get(source)));
    }
    
    public static void signalMenuButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MenuButton.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MenuButton(References.get(source)));
    }
    
    public static boolean signalDropTargetAsyncAccept(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.AcceptHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DropTargetAsync(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)));
    }
    
    public static void signalDropTargetAsyncDragEnter(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DragEnterHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTargetAsync(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)), x, y);
    }
    
    public static void signalDropTargetAsyncDragLeave(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DragLeaveHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTargetAsync(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)));
    }
    
    public static void signalDropTargetAsyncDragMotion(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DragMotionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTargetAsync(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)), x, y);
    }
    
    public static boolean signalDropTargetAsyncDrop(MemoryAddress source, MemoryAddress drop, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTargetAsync.DropHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DropTargetAsync(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)), x, y);
    }
    
    public static void cbTextTagTableForeach(MemoryAddress tag, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextTagTableForeach) Interop.signalRegistry.get(hash);
        handler.onTextTagTableForeach(new TextTag(References.get(tag, false)));
    }
    
    public static void signalEditableChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Editable.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Editable.EditableImpl(References.get(source)));
    }
    
    public static void signalEditableDeleteText(MemoryAddress source, int startPos, int endPos, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Editable.DeleteTextHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Editable.EditableImpl(References.get(source)), startPos, endPos);
    }
    
    public static void signalEditableInsertText(MemoryAddress source, MemoryAddress text, int length, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Editable.InsertTextHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Editable.EditableImpl(References.get(source)), text.getUtf8String(0), length, position);
    }
    
    public static void signalEmojiChooserEmojiPicked(MemoryAddress source, MemoryAddress text, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EmojiChooser.EmojiPickedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EmojiChooser(References.get(source)), text.getUtf8String(0));
    }
    
    public static void cbPrintSettingsFunc(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (PrintSettingsFunc) Interop.signalRegistry.get(hash);
        handler.onPrintSettingsFunc(key.getUtf8String(0), value.getUtf8String(0));
    }
    
    public static void signalColorChooserColorActivated(MemoryAddress source, MemoryAddress color, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ColorChooser.ColorActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ColorChooser.ColorChooserImpl(References.get(source)), new org.gtk.gdk.RGBA(References.get(color, false)));
    }
    
    public static void cbTreeModelFilterModifyFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress value, int column, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModelFilterModifyFunc) Interop.signalRegistry.get(hash);
        handler.onTreeModelFilterModifyFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)), new org.gtk.gobject.Value(References.get(value, false)), column);
    }
    
    public static void signalGestureRotateAngleChanged(MemoryAddress source, double angle, double angleDelta, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureRotate.AngleChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureRotate(References.get(source)), angle, angleDelta);
    }
    
    public static void signalTreeViewColumnsChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.ColumnsChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeView(References.get(source)));
    }
    
    public static void signalTreeViewCursorChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.CursorChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeView(References.get(source)));
    }
    
    public static boolean signalTreeViewExpandCollapseCursorRow(MemoryAddress source, boolean object, boolean p0, boolean p1, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.ExpandCollapseCursorRowHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(References.get(source)), object, p0, p1);
    }
    
    public static boolean signalTreeViewMoveCursor(MemoryAddress source, int step, int direction, boolean extend, boolean modify, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.MoveCursorHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(References.get(source)), MovementStep.fromValue(step), direction, extend, modify);
    }
    
    public static void signalTreeViewRowActivated(MemoryAddress source, MemoryAddress path, MemoryAddress column, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.RowActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeView(References.get(source)), new TreePath(References.get(path, false)), new TreeViewColumn(References.get(column, false)));
    }
    
    public static void signalTreeViewRowCollapsed(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.RowCollapsedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeView(References.get(source)), new TreeIter(References.get(iter, false)), new TreePath(References.get(path, false)));
    }
    
    public static void signalTreeViewRowExpanded(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.RowExpandedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeView(References.get(source)), new TreeIter(References.get(iter, false)), new TreePath(References.get(path, false)));
    }
    
    public static boolean signalTreeViewSelectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.SelectAllHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(References.get(source)));
    }
    
    public static boolean signalTreeViewSelectCursorParent(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.SelectCursorParentHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(References.get(source)));
    }
    
    public static boolean signalTreeViewSelectCursorRow(MemoryAddress source, boolean object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.SelectCursorRowHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(References.get(source)), object);
    }
    
    public static boolean signalTreeViewStartInteractiveSearch(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.StartInteractiveSearchHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(References.get(source)));
    }
    
    public static boolean signalTreeViewTestCollapseRow(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.TestCollapseRowHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(References.get(source)), new TreeIter(References.get(iter, false)), new TreePath(References.get(path, false)));
    }
    
    public static boolean signalTreeViewTestExpandRow(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.TestExpandRowHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(References.get(source)), new TreeIter(References.get(iter, false)), new TreePath(References.get(path, false)));
    }
    
    public static boolean signalTreeViewToggleCursorRow(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.ToggleCursorRowHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(References.get(source)));
    }
    
    public static boolean signalTreeViewUnselectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeView.UnselectAllHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TreeView(References.get(source)));
    }
    
    public static void signalGridViewActivate(MemoryAddress source, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GridView.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GridView(References.get(source)), position);
    }
    
    public static boolean cbTreeViewSearchEqualFunc(MemoryAddress model, int column, MemoryAddress key, MemoryAddress iter, MemoryAddress searchData) {
        int hash = searchData.get(C_INT, 0);
        var handler = (TreeViewSearchEqualFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeViewSearchEqualFunc(new TreeModel.TreeModelImpl(References.get(model, false)), column, key.getUtf8String(0), new TreeIter(References.get(iter, false)));
    }
    
    public static void signalCellRendererAccelAccelCleared(MemoryAddress source, MemoryAddress pathString, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRendererAccel.AccelClearedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellRendererAccel(References.get(source)), pathString.getUtf8String(0));
    }
    
    public static void signalCellRendererAccelAccelEdited(MemoryAddress source, MemoryAddress pathString, int accelKey, int accelMods, int hardwareKeycode, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRendererAccel.AccelEditedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellRendererAccel(References.get(source)), pathString.getUtf8String(0), accelKey, accelMods, hardwareKeycode);
    }
    
    public static void signalTreeViewColumnClicked(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeViewColumn.ClickedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeViewColumn(References.get(source)));
    }
    
    public static void signalAssistantApply(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Assistant.ApplyHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Assistant(References.get(source)));
    }
    
    public static void signalAssistantCancel(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Assistant.CancelHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Assistant(References.get(source)));
    }
    
    public static void signalAssistantClose(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Assistant.CloseHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Assistant(References.get(source)));
    }
    
    public static void signalAssistantEscape(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Assistant.EscapeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Assistant(References.get(source)));
    }
    
    public static void signalAssistantPrepare(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Assistant.PrepareHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Assistant(References.get(source)), new Widget(References.get(page, false)));
    }
    
    public static boolean signalOverlayGetChildPosition(MemoryAddress source, MemoryAddress widget, MemoryAddress allocation, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Overlay.GetChildPositionHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Overlay(References.get(source)), new Widget(References.get(widget, false)), new org.gtk.gdk.Rectangle(References.get(allocation, false)));
    }
    
    public static void cbTreeCellDataFunc(MemoryAddress treeColumn, MemoryAddress cell, MemoryAddress treeModel, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeCellDataFunc) Interop.signalRegistry.get(hash);
        handler.onTreeCellDataFunc(new TreeViewColumn(References.get(treeColumn, false)), new CellRenderer(References.get(cell, false)), new TreeModel.TreeModelImpl(References.get(treeModel, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static boolean cbTreeModelFilterVisibleFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModelFilterVisibleFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeModelFilterVisibleFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static void signalComboBoxActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ComboBox(References.get(source)));
    }
    
    public static void signalComboBoxChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ComboBox(References.get(source)));
    }
    
    public static void signalComboBoxFormatEntryText(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.FormatEntryTextHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ComboBox(References.get(source)), path.getUtf8String(0));
    }
    
    public static void signalComboBoxMoveActive(MemoryAddress source, int scrollType, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.MoveActiveHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ComboBox(References.get(source)), ScrollType.fromValue(scrollType));
    }
    
    public static boolean signalComboBoxPopdown(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.PopdownHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new ComboBox(References.get(source)));
    }
    
    public static void signalComboBoxPopup(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ComboBox.PopupHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ComboBox(References.get(source)));
    }
    
    public static void signalGestureZoomScaleChanged(MemoryAddress source, double scale, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureZoom.ScaleChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureZoom(References.get(source)), scale);
    }
    
    public static boolean cbTextCharPredicate(int ch, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TextCharPredicate) Interop.signalRegistry.get(hash);
        return handler.onTextCharPredicate(ch);
    }
    
    public static void signalListBoxActivateCursorRow(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.ActivateCursorRowHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListBox(References.get(source)));
    }
    
    public static void signalListBoxMoveCursor(MemoryAddress source, int object, int p0, boolean p1, boolean p2, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.MoveCursorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListBox(References.get(source)), MovementStep.fromValue(object), p0, p1, p2);
    }
    
    public static void signalListBoxRowActivated(MemoryAddress source, MemoryAddress row, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.RowActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListBox(References.get(source)), new ListBoxRow(References.get(row, false)));
    }
    
    public static void signalListBoxRowSelected(MemoryAddress source, MemoryAddress row, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.RowSelectedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListBox(References.get(source)), new ListBoxRow(References.get(row, false)));
    }
    
    public static void signalListBoxSelectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.SelectAllHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListBox(References.get(source)));
    }
    
    public static void signalListBoxSelectedRowsChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.SelectedRowsChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListBox(References.get(source)));
    }
    
    public static void signalListBoxToggleCursorRow(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.ToggleCursorRowHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListBox(References.get(source)));
    }
    
    public static void signalListBoxUnselectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListBox.UnselectAllHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListBox(References.get(source)));
    }
    
    public static void signalFlowBoxChildActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FlowBoxChild.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FlowBoxChild(References.get(source)));
    }
    
    public static void cbPageSetupDoneFunc(MemoryAddress pageSetup, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PageSetupDoneFunc) Interop.signalRegistry.get(hash);
        handler.onPageSetupDoneFunc(new PageSetup(References.get(pageSetup, false)));
    }
    
    public static void signalTreeModelRowChanged(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModel.RowChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeModel.TreeModelImpl(References.get(source)), new TreePath(References.get(path, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static void signalTreeModelRowDeleted(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModel.RowDeletedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeModel.TreeModelImpl(References.get(source)), new TreePath(References.get(path, false)));
    }
    
    public static void signalTreeModelRowHasChildToggled(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModel.RowHasChildToggledHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeModel.TreeModelImpl(References.get(source)), new TreePath(References.get(path, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static void signalTreeModelRowInserted(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModel.RowInsertedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeModel.TreeModelImpl(References.get(source)), new TreePath(References.get(path, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static void signalTreeModelRowsReordered(MemoryAddress source, MemoryAddress path, MemoryAddress iter, MemoryAddress newOrder, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeModel.RowsReorderedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeModel.TreeModelImpl(References.get(source)), new TreePath(References.get(path, false)), new TreeIter(References.get(iter, false)), newOrder);
    }
    
    public static void signalDropDownActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropDown.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropDown(References.get(source)));
    }
    
    public static void signalSearchEntryActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(References.get(source)));
    }
    
    public static void signalSearchEntryNextMatch(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.NextMatchHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(References.get(source)));
    }
    
    public static void signalSearchEntryPreviousMatch(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.PreviousMatchHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(References.get(source)));
    }
    
    public static void signalSearchEntrySearchChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.SearchChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(References.get(source)));
    }
    
    public static void signalSearchEntrySearchStarted(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.SearchStartedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(References.get(source)));
    }
    
    public static void signalSearchEntryStopSearch(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SearchEntry.StopSearchHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SearchEntry(References.get(source)));
    }
    
    public static void signalWindowActivateDefault(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Window.ActivateDefaultHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Window(References.get(source)));
    }
    
    public static void signalWindowActivateFocus(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Window.ActivateFocusHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Window(References.get(source)));
    }
    
    public static boolean signalWindowCloseRequest(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Window.CloseRequestHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Window(References.get(source)));
    }
    
    public static boolean signalWindowEnableDebugging(MemoryAddress source, boolean toggle, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Window.EnableDebuggingHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Window(References.get(source)), toggle);
    }
    
    public static void signalWindowKeysChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Window.KeysChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Window(References.get(source)));
    }
    
    public static void signalGLAreaCreateContext(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GLArea.CreateContextHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GLArea(References.get(source)));
    }
    
    public static boolean signalGLAreaRender(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GLArea.RenderHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new GLArea(References.get(source)), new org.gtk.gdk.GLContext(References.get(context, false)));
    }
    
    public static void signalGLAreaResize(MemoryAddress source, int width, int height, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GLArea.ResizeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GLArea(References.get(source)), width, height);
    }
    
    public static void signalCalendarDaySelected(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Calendar.DaySelectedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Calendar(References.get(source)));
    }
    
    public static void signalCalendarNextMonth(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Calendar.NextMonthHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Calendar(References.get(source)));
    }
    
    public static void signalCalendarNextYear(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Calendar.NextYearHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Calendar(References.get(source)));
    }
    
    public static void signalCalendarPrevMonth(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Calendar.PrevMonthHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Calendar(References.get(source)));
    }
    
    public static void signalCalendarPrevYear(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Calendar.PrevYearHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Calendar(References.get(source)));
    }
    
    public static void signalColumnViewActivate(MemoryAddress source, int position, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ColumnView.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ColumnView(References.get(source)), position);
    }
    
    public static void cbIconViewForeachFunc(MemoryAddress iconView, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconViewForeachFunc) Interop.signalRegistry.get(hash);
        handler.onIconViewForeachFunc(new IconView(References.get(iconView, false)), new TreePath(References.get(path, false)));
    }
    
    public static void signalCheckButtonActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CheckButton.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CheckButton(References.get(source)));
    }
    
    public static void signalCheckButtonToggled(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CheckButton.ToggledHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CheckButton(References.get(source)));
    }
    
    public static boolean signalEventControllerLegacyEvent(MemoryAddress source, MemoryAddress event, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerLegacy.EventHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new EventControllerLegacy(References.get(source)), new org.gtk.gdk.Event(References.get(event, false)));
    }
    
    public static void signalLabelActivateCurrentLink(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Label.ActivateCurrentLinkHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Label(References.get(source)));
    }
    
    public static boolean signalLabelActivateLink(MemoryAddress source, MemoryAddress uri, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Label.ActivateLinkHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Label(References.get(source)), uri.getUtf8String(0));
    }
    
    public static void signalLabelCopyClipboard(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Label.CopyClipboardHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Label(References.get(source)));
    }
    
    public static void signalLabelMoveCursor(MemoryAddress source, int step, int count, boolean extendSelection, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Label.MoveCursorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Label(References.get(source)), MovementStep.fromValue(step), count, extendSelection);
    }
    
    public static org.gtk.gobject.Object cbMapListModelMapFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (MapListModelMapFunc) Interop.signalRegistry.get(hash);
        return handler.onMapListModelMapFunc(new org.gtk.gobject.Object(References.get(item, true)));
    }
    
    public static boolean cbFlowBoxFilterFunc(MemoryAddress child, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FlowBoxFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onFlowBoxFilterFunc(new FlowBoxChild(References.get(child, false)));
    }
    
    public static void signalStyleProviderGtkPrivateChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (StyleProvider.GtkPrivateChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new StyleProvider.StyleProviderImpl(References.get(source)));
    }
    
    public static void signalLevelBarOffsetChanged(MemoryAddress source, MemoryAddress name, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (LevelBar.OffsetChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new LevelBar(References.get(source)), name.getUtf8String(0));
    }
    
    public static void signalStatusbarTextPopped(MemoryAddress source, int contextId, MemoryAddress text, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Statusbar.TextPoppedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Statusbar(References.get(source)), contextId, text.getUtf8String(0));
    }
    
    public static void signalStatusbarTextPushed(MemoryAddress source, int contextId, MemoryAddress text, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Statusbar.TextPushedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Statusbar(References.get(source)), contextId, text.getUtf8String(0));
    }
    
    public static void signalATContextStateChange(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ATContext.StateChangeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ATContext(References.get(source)));
    }
    
    public static boolean cbCustomFilterFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (CustomFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onCustomFilterFunc(new org.gtk.gobject.Object(References.get(item, false)));
    }
    
    public static void cbPrintJobCompleteFunc(MemoryAddress printJob, MemoryAddress userData, MemoryAddress error) {
        int hash = userData.get(C_INT, 0);
        var handler = (PrintJobCompleteFunc) Interop.signalRegistry.get(hash);
        handler.onPrintJobCompleteFunc(new PrintJob(References.get(printJob, false)), new org.gtk.glib.Error(References.get(error, false)));
    }
    
    public static void signalTreeSortableSortColumnChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeSortable.SortColumnChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeSortable.TreeSortableImpl(References.get(source)));
    }
    
    public static void signalNativeDialogResponse(MemoryAddress source, int responseId, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (NativeDialog.ResponseHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new NativeDialog(References.get(source)), responseId);
    }
    
    public static void signalFilterChanged(MemoryAddress source, int change, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Filter.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Filter(References.get(source)), FilterChange.fromValue(change));
    }
    
    public static void signalCellEditableEditingDone(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellEditable.EditingDoneHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellEditable.CellEditableImpl(References.get(source)));
    }
    
    public static void signalCellEditableRemoveWidget(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellEditable.RemoveWidgetHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellEditable.CellEditableImpl(References.get(source)));
    }
    
    public static org.gtk.gio.ListModel cbTreeListModelCreateModelFunc(MemoryAddress item, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TreeListModelCreateModelFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeListModelCreateModelFunc(new org.gtk.gobject.Object(References.get(item, false)));
    }
    
    public static boolean cbTreeSelectionFunc(MemoryAddress selection, MemoryAddress model, MemoryAddress path, boolean pathCurrentlySelected, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeSelectionFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeSelectionFunc(new TreeSelection(References.get(selection, false)), new TreeModel.TreeModelImpl(References.get(model, false)), new TreePath(References.get(path, false)), pathCurrentlySelected);
    }
    
    public static void signalSignalListItemFactoryBind(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalListItemFactory.BindHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(References.get(source)), new ListItem(References.get(listitem, false)));
    }
    
    public static void signalSignalListItemFactorySetup(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalListItemFactory.SetupHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(References.get(source)), new ListItem(References.get(listitem, false)));
    }
    
    public static void signalSignalListItemFactoryTeardown(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalListItemFactory.TeardownHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(References.get(source)), new ListItem(References.get(listitem, false)));
    }
    
    public static void signalSignalListItemFactoryUnbind(MemoryAddress source, MemoryAddress listitem, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalListItemFactory.UnbindHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SignalListItemFactory(References.get(source)), new ListItem(References.get(listitem, false)));
    }
    
    public static boolean signalAboutDialogActivateLink(MemoryAddress source, MemoryAddress uri, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AboutDialog.ActivateLinkHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new AboutDialog(References.get(source)), uri.getUtf8String(0));
    }
    
    public static void signalTreeSelectionChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeSelection.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeSelection(References.get(source)));
    }
    
    public static void signalSwitchActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Switch.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Switch(References.get(source)));
    }
    
    public static boolean signalSwitchStateSet(MemoryAddress source, boolean state, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Switch.StateSetHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Switch(References.get(source)), state);
    }
    
    public static void cbDrawingAreaDrawFunc(MemoryAddress drawingArea, MemoryAddress cr, int width, int height, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DrawingAreaDrawFunc) Interop.signalRegistry.get(hash);
        handler.onDrawingAreaDrawFunc(new DrawingArea(References.get(drawingArea, false)), new org.cairographics.Context(References.get(cr, false)), width, height);
    }
    
    public static void signalIconThemeChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IconTheme.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconTheme(References.get(source)));
    }
    
    public static boolean cbShortcutFunc(MemoryAddress widget, MemoryAddress args, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ShortcutFunc) Interop.signalRegistry.get(hash);
        return handler.onShortcutFunc(new Widget(References.get(widget, false)), new org.gtk.glib.Variant(References.get(args, false)));
    }
    
    public static void signalInfoBarClose(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (InfoBar.CloseHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new InfoBar(References.get(source)));
    }
    
    public static void signalInfoBarResponse(MemoryAddress source, int responseId, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (InfoBar.ResponseHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new InfoBar(References.get(source)), responseId);
    }
    
    public static void signalEventControllerScrollDecelerate(MemoryAddress source, double velX, double velY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerScroll.DecelerateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerScroll(References.get(source)), velX, velY);
    }
    
    public static boolean signalEventControllerScrollScroll(MemoryAddress source, double dx, double dy, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerScroll.ScrollHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new EventControllerScroll(References.get(source)), dx, dy);
    }
    
    public static void signalEventControllerScrollScrollBegin(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerScroll.ScrollBeginHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerScroll(References.get(source)));
    }
    
    public static void signalEventControllerScrollScrollEnd(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerScroll.ScrollEndHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerScroll(References.get(source)));
    }
    
    public static void cbListBoxUpdateHeaderFunc(MemoryAddress row, MemoryAddress before, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ListBoxUpdateHeaderFunc) Interop.signalRegistry.get(hash);
        handler.onListBoxUpdateHeaderFunc(new ListBoxRow(References.get(row, false)), new ListBoxRow(References.get(before, false)));
    }
    
    public static void signalTextTagTableTagAdded(MemoryAddress source, MemoryAddress tag, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextTagTable.TagAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextTagTable(References.get(source)), new TextTag(References.get(tag, false)));
    }
    
    public static void signalTextTagTableTagChanged(MemoryAddress source, MemoryAddress tag, boolean sizeChanged, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextTagTable.TagChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextTagTable(References.get(source)), new TextTag(References.get(tag, false)), sizeChanged);
    }
    
    public static void signalTextTagTableTagRemoved(MemoryAddress source, MemoryAddress tag, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextTagTable.TagRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextTagTable(References.get(source)), new TextTag(References.get(tag, false)));
    }
    
    public static void signalGestureDragDragBegin(MemoryAddress source, double startX, double startY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureDrag.DragBeginHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureDrag(References.get(source)), startX, startY);
    }
    
    public static void signalGestureDragDragEnd(MemoryAddress source, double offsetX, double offsetY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureDrag.DragEndHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureDrag(References.get(source)), offsetX, offsetY);
    }
    
    public static void signalGestureDragDragUpdate(MemoryAddress source, double offsetX, double offsetY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureDrag.DragUpdateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureDrag(References.get(source)), offsetX, offsetY);
    }
    
    public static int cbTreeIterCompareFunc(MemoryAddress model, MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TreeIterCompareFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeIterCompareFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(a, false)), new TreeIter(References.get(b, false)));
    }
    
    public static boolean cbCellAllocCallback(MemoryAddress renderer, MemoryAddress cellArea, MemoryAddress cellBackground, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellAllocCallback) Interop.signalRegistry.get(hash);
        return handler.onCellAllocCallback(new CellRenderer(References.get(renderer, false)), new org.gtk.gdk.Rectangle(References.get(cellArea, false)), new org.gtk.gdk.Rectangle(References.get(cellBackground, false)));
    }
    
    public static void signalCellRendererEditingCanceled(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRenderer.EditingCanceledHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellRenderer(References.get(source)));
    }
    
    public static void signalCellRendererEditingStarted(MemoryAddress source, MemoryAddress editable, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CellRenderer.EditingStartedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellRenderer(References.get(source)), new CellEditable.CellEditableImpl(References.get(editable, false)), path.getUtf8String(0));
    }
    
    public static void signalPrinterDetailsAcquired(MemoryAddress source, boolean success, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Printer.DetailsAcquiredHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Printer(References.get(source)), success);
    }
    
    public static boolean cbTickCallback(MemoryAddress widget, MemoryAddress frameClock, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TickCallback) Interop.signalRegistry.get(hash);
        return handler.onTickCallback(new Widget(References.get(widget, false)), new org.gtk.gdk.FrameClock(References.get(frameClock, false)));
    }
    
    public static void signalGestureBegin(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Gesture.BeginHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Gesture(References.get(source)), new org.gtk.gdk.EventSequence(References.get(sequence, false)));
    }
    
    public static void signalGestureCancel(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Gesture.CancelHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Gesture(References.get(source)), new org.gtk.gdk.EventSequence(References.get(sequence, false)));
    }
    
    public static void signalGestureEnd(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Gesture.EndHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Gesture(References.get(source)), new org.gtk.gdk.EventSequence(References.get(sequence, false)));
    }
    
    public static void signalGestureSequenceStateChanged(MemoryAddress source, MemoryAddress sequence, int state, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Gesture.SequenceStateChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Gesture(References.get(source)), new org.gtk.gdk.EventSequence(References.get(sequence, false)), EventSequenceState.fromValue(state));
    }
    
    public static void signalGestureUpdate(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Gesture.UpdateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Gesture(References.get(source)), new org.gtk.gdk.EventSequence(References.get(sequence, false)));
    }
    
    public static void signalPrintJobStatusChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrintJob.StatusChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new PrintJob(References.get(source)));
    }
    
    public static boolean signalDropTargetAccept(MemoryAddress source, MemoryAddress drop, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.AcceptHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DropTarget(References.get(source)), new org.gtk.gdk.Drop(References.get(drop, false)));
    }
    
    public static boolean signalDropTargetDrop(MemoryAddress source, MemoryAddress value, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.DropHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DropTarget(References.get(source)), new org.gtk.gobject.Value(References.get(value, false)), x, y);
    }
    
    public static void signalDropTargetEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.EnterHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTarget(References.get(source)), x, y);
    }
    
    public static void signalDropTargetLeave(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.LeaveHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTarget(References.get(source)));
    }
    
    public static void signalDropTargetMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DropTarget.MotionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DropTarget(References.get(source)), x, y);
    }
    
    public static boolean cbPrinterFunc(MemoryAddress printer, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (PrinterFunc) Interop.signalRegistry.get(hash);
        return handler.onPrinterFunc(new Printer(References.get(printer, false)));
    }
    
    public static boolean signalLinkButtonActivateLink(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (LinkButton.ActivateLinkHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new LinkButton(References.get(source)));
    }
    
    public static void signalEventControllerKeyImUpdate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerKey.ImUpdateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerKey(References.get(source)));
    }
    
    public static boolean signalEventControllerKeyKeyPressed(MemoryAddress source, int keyval, int keycode, int state, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerKey.KeyPressedHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new EventControllerKey(References.get(source)), keyval, keycode, state);
    }
    
    public static void signalEventControllerKeyKeyReleased(MemoryAddress source, int keyval, int keycode, int state, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerKey.KeyReleasedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerKey(References.get(source)), keyval, keycode, state);
    }
    
    public static boolean signalEventControllerKeyModifiers(MemoryAddress source, int keyval, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerKey.ModifiersHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new EventControllerKey(References.get(source)), keyval);
    }
    
    public static void signalTextBufferApplyTag(MemoryAddress source, MemoryAddress tag, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.ApplyTagHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)), new TextTag(References.get(tag, false)), new TextIter(References.get(start, false)), new TextIter(References.get(end, false)));
    }
    
    public static void signalTextBufferBeginUserAction(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.BeginUserActionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)));
    }
    
    public static void signalTextBufferChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)));
    }
    
    public static void signalTextBufferDeleteRange(MemoryAddress source, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.DeleteRangeHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)), new TextIter(References.get(start, false)), new TextIter(References.get(end, false)));
    }
    
    public static void signalTextBufferEndUserAction(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.EndUserActionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)));
    }
    
    public static void signalTextBufferInsertChildAnchor(MemoryAddress source, MemoryAddress location, MemoryAddress anchor, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.InsertChildAnchorHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)), new TextIter(References.get(location, false)), new TextChildAnchor(References.get(anchor, false)));
    }
    
    public static void signalTextBufferInsertPaintable(MemoryAddress source, MemoryAddress location, MemoryAddress paintable, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.InsertPaintableHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)), new TextIter(References.get(location, false)), new org.gtk.gdk.Paintable.PaintableImpl(References.get(paintable, false)));
    }
    
    public static void signalTextBufferInsertText(MemoryAddress source, MemoryAddress location, MemoryAddress text, int len, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.InsertTextHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)), new TextIter(References.get(location, false)), text.getUtf8String(0), len);
    }
    
    public static void signalTextBufferMarkDeleted(MemoryAddress source, MemoryAddress mark, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.MarkDeletedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)), new TextMark(References.get(mark, false)));
    }
    
    public static void signalTextBufferMarkSet(MemoryAddress source, MemoryAddress location, MemoryAddress mark, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.MarkSetHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)), new TextIter(References.get(location, false)), new TextMark(References.get(mark, false)));
    }
    
    public static void signalTextBufferModifiedChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.ModifiedChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)));
    }
    
    public static void signalTextBufferPasteDone(MemoryAddress source, MemoryAddress clipboard, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.PasteDoneHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)), new org.gtk.gdk.Clipboard(References.get(clipboard, false)));
    }
    
    public static void signalTextBufferRedo(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.RedoHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)));
    }
    
    public static void signalTextBufferRemoveTag(MemoryAddress source, MemoryAddress tag, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.RemoveTagHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)), new TextTag(References.get(tag, false)), new TextIter(References.get(start, false)), new TextIter(References.get(end, false)));
    }
    
    public static void signalTextBufferUndo(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TextBuffer.UndoHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextBuffer(References.get(source)));
    }
    
    public static boolean cbTreeViewRowSeparatorFunc(MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeViewRowSeparatorFunc) Interop.signalRegistry.get(hash);
        return handler.onTreeViewRowSeparatorFunc(new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)));
    }
    
    public static boolean signalNotebookChangeCurrentPage(MemoryAddress source, int object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.ChangeCurrentPageHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Notebook(References.get(source)), object);
    }
    
    public static void signalNotebookCreateWindow(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.CreateWindowHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Notebook(References.get(source)), new Widget(References.get(page, false)));
    }
    
    public static boolean signalNotebookFocusTab(MemoryAddress source, int object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.FocusTabHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Notebook(References.get(source)), NotebookTab.fromValue(object));
    }
    
    public static void signalNotebookMoveFocusOut(MemoryAddress source, int object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.MoveFocusOutHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Notebook(References.get(source)), DirectionType.fromValue(object));
    }
    
    public static void signalNotebookPageAdded(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.PageAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Notebook(References.get(source)), new Widget(References.get(child, false)), pageNum);
    }
    
    public static void signalNotebookPageRemoved(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.PageRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Notebook(References.get(source)), new Widget(References.get(child, false)), pageNum);
    }
    
    public static void signalNotebookPageReordered(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.PageReorderedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Notebook(References.get(source)), new Widget(References.get(child, false)), pageNum);
    }
    
    public static boolean signalNotebookReorderTab(MemoryAddress source, int object, boolean p0, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.ReorderTabHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Notebook(References.get(source)), DirectionType.fromValue(object), p0);
    }
    
    public static boolean signalNotebookSelectPage(MemoryAddress source, boolean object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.SelectPageHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Notebook(References.get(source)), object);
    }
    
    public static void signalNotebookSwitchPage(MemoryAddress source, MemoryAddress page, int pageNum, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Notebook.SwitchPageHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Notebook(References.get(source)), new Widget(References.get(page, false)), pageNum);
    }
    
    public static void signalEventControllerFocusEnter(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerFocus.EnterHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerFocus(References.get(source)));
    }
    
    public static void signalEventControllerFocusLeave(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerFocus.LeaveHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerFocus(References.get(source)));
    }
    
}

package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class IMContextClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIMContextClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("preedit_start"),
            Interop.valueLayout.ADDRESS.withName("preedit_end"),
            Interop.valueLayout.ADDRESS.withName("preedit_changed"),
            Interop.valueLayout.ADDRESS.withName("commit"),
            Interop.valueLayout.ADDRESS.withName("retrieve_surrounding"),
            Interop.valueLayout.ADDRESS.withName("delete_surrounding"),
            Interop.valueLayout.ADDRESS.withName("set_client_widget"),
            Interop.valueLayout.ADDRESS.withName("get_preedit_string"),
            Interop.valueLayout.ADDRESS.withName("filter_keypress"),
            Interop.valueLayout.ADDRESS.withName("focus_in"),
            Interop.valueLayout.ADDRESS.withName("focus_out"),
            Interop.valueLayout.ADDRESS.withName("reset"),
            Interop.valueLayout.ADDRESS.withName("set_cursor_location"),
            Interop.valueLayout.ADDRESS.withName("set_use_preedit"),
            Interop.valueLayout.ADDRESS.withName("set_surrounding"),
            Interop.valueLayout.ADDRESS.withName("get_surrounding"),
            Interop.valueLayout.ADDRESS.withName("set_surrounding_with_selection"),
            Interop.valueLayout.ADDRESS.withName("get_surrounding_with_selection"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved4"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved5")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link IMContextClass}
     * @return A new, uninitialized @{link IMContextClass}
     */
    public static IMContextClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        IMContextClass newInstance = new IMContextClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code PreeditStartCallback} callback.
     */
    @FunctionalInterface
    public interface PreeditStartCallback {
    
        void run(org.gtk.gtk.IMContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PreeditStartCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code preedit_start}
     * @param preeditStart The new value of the field {@code preedit_start}
     */
    public void setPreeditStart(PreeditStartCallback preeditStart) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preedit_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (preeditStart == null ? MemoryAddress.NULL : preeditStart.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PreeditEndCallback} callback.
     */
    @FunctionalInterface
    public interface PreeditEndCallback {
    
        void run(org.gtk.gtk.IMContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PreeditEndCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code preedit_end}
     * @param preeditEnd The new value of the field {@code preedit_end}
     */
    public void setPreeditEnd(PreeditEndCallback preeditEnd) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preedit_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (preeditEnd == null ? MemoryAddress.NULL : preeditEnd.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PreeditChangedCallback} callback.
     */
    @FunctionalInterface
    public interface PreeditChangedCallback {
    
        void run(org.gtk.gtk.IMContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PreeditChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code preedit_changed}
     * @param preeditChanged The new value of the field {@code preedit_changed}
     */
    public void setPreeditChanged(PreeditChangedCallback preeditChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preedit_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (preeditChanged == null ? MemoryAddress.NULL : preeditChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CommitCallback} callback.
     */
    @FunctionalInterface
    public interface CommitCallback {
    
        void run(org.gtk.gtk.IMContext context, java.lang.String str);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress str) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), Marshal.addressToString.marshal(str, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CommitCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code commit}
     * @param commit The new value of the field {@code commit}
     */
    public void setCommit(CommitCallback commit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("commit"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (commit == null ? MemoryAddress.NULL : commit.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RetrieveSurroundingCallback} callback.
     */
    @FunctionalInterface
    public interface RetrieveSurroundingCallback {
    
        boolean run(org.gtk.gtk.IMContext context);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context) {
            var RESULT = run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RetrieveSurroundingCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code retrieve_surrounding}
     * @param retrieveSurrounding The new value of the field {@code retrieve_surrounding}
     */
    public void setRetrieveSurrounding(RetrieveSurroundingCallback retrieveSurrounding) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("retrieve_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (retrieveSurrounding == null ? MemoryAddress.NULL : retrieveSurrounding.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteSurroundingCallback} callback.
     */
    @FunctionalInterface
    public interface DeleteSurroundingCallback {
    
        boolean run(org.gtk.gtk.IMContext context, int offset, int nChars);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context, int offset, int nChars) {
            var RESULT = run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), offset, nChars);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteSurroundingCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_surrounding}
     * @param deleteSurrounding The new value of the field {@code delete_surrounding}
     */
    public void setDeleteSurrounding(DeleteSurroundingCallback deleteSurrounding) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteSurrounding == null ? MemoryAddress.NULL : deleteSurrounding.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetClientWidgetCallback} callback.
     */
    @FunctionalInterface
    public interface SetClientWidgetCallback {
    
        void run(org.gtk.gtk.IMContext context, @Nullable org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress widget) {
            run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetClientWidgetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_client_widget}
     * @param setClientWidget The new value of the field {@code set_client_widget}
     */
    public void setSetClientWidget(SetClientWidgetCallback setClientWidget) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_client_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setClientWidget == null ? MemoryAddress.NULL : setClientWidget.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreeditStringCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreeditStringCallback {
    
        void run(org.gtk.gtk.IMContext context, Out<java.lang.String> str, Out<org.pango.AttrList> attrs, Out<Integer> cursorPos);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress str, MemoryAddress attrs, MemoryAddress cursorPos) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<java.lang.String> strOUT = new Out<>(Marshal.addressToString.marshal(str, null));
                Out<org.pango.AttrList> attrsOUT = new Out<>(org.pango.AttrList.fromAddress.marshal(attrs, null));
                Out<Integer> cursorPosOUT = new Out<>(cursorPos.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), strOUT, attrsOUT, cursorPosOUT);
                str.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(strOUT.get(), SCOPE));
                attrs.set(Interop.valueLayout.ADDRESS, 0, attrsOUT.get().handle());
                cursorPos.set(Interop.valueLayout.C_INT, 0, cursorPosOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPreeditStringCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preedit_string}
     * @param getPreeditString The new value of the field {@code get_preedit_string}
     */
    public void setGetPreeditString(GetPreeditStringCallback getPreeditString) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preedit_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreeditString == null ? MemoryAddress.NULL : getPreeditString.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FilterKeypressCallback} callback.
     */
    @FunctionalInterface
    public interface FilterKeypressCallback {
    
        boolean run(org.gtk.gtk.IMContext context, org.gtk.gdk.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress event) {
            var RESULT = run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), (org.gtk.gdk.Event) Interop.register(event, org.gtk.gdk.Event.fromAddress).marshal(event, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FilterKeypressCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code filter_keypress}
     * @param filterKeypress The new value of the field {@code filter_keypress}
     */
    public void setFilterKeypress(FilterKeypressCallback filterKeypress) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("filter_keypress"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (filterKeypress == null ? MemoryAddress.NULL : filterKeypress.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FocusInCallback} callback.
     */
    @FunctionalInterface
    public interface FocusInCallback {
    
        void run(org.gtk.gtk.IMContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FocusInCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code focus_in}
     * @param focusIn The new value of the field {@code focus_in}
     */
    public void setFocusIn(FocusInCallback focusIn) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus_in"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (focusIn == null ? MemoryAddress.NULL : focusIn.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FocusOutCallback} callback.
     */
    @FunctionalInterface
    public interface FocusOutCallback {
    
        void run(org.gtk.gtk.IMContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FocusOutCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code focus_out}
     * @param focusOut The new value of the field {@code focus_out}
     */
    public void setFocusOut(FocusOutCallback focusOut) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus_out"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (focusOut == null ? MemoryAddress.NULL : focusOut.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ResetCallback} callback.
     */
    @FunctionalInterface
    public interface ResetCallback {
    
        void run(org.gtk.gtk.IMContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ResetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reset}
     * @param reset The new value of the field {@code reset}
     */
    public void setReset(ResetCallback reset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetCursorLocationCallback} callback.
     */
    @FunctionalInterface
    public interface SetCursorLocationCallback {
    
        void run(org.gtk.gtk.IMContext context, org.gtk.gdk.Rectangle area);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress area) {
            run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), org.gtk.gdk.Rectangle.fromAddress.marshal(area, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetCursorLocationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_cursor_location}
     * @param setCursorLocation The new value of the field {@code set_cursor_location}
     */
    public void setSetCursorLocation(SetCursorLocationCallback setCursorLocation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_cursor_location"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCursorLocation == null ? MemoryAddress.NULL : setCursorLocation.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetUsePreeditCallback} callback.
     */
    @FunctionalInterface
    public interface SetUsePreeditCallback {
    
        void run(org.gtk.gtk.IMContext context, boolean usePreedit);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, int usePreedit) {
            run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), Marshal.integerToBoolean.marshal(usePreedit, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetUsePreeditCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_use_preedit}
     * @param setUsePreedit The new value of the field {@code set_use_preedit}
     */
    public void setSetUsePreedit(SetUsePreeditCallback setUsePreedit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_use_preedit"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setUsePreedit == null ? MemoryAddress.NULL : setUsePreedit.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetSurroundingCallback} callback.
     */
    @FunctionalInterface
    public interface SetSurroundingCallback {
    
        void run(org.gtk.gtk.IMContext context, java.lang.String text, int len, int cursorIndex);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress text, int len, int cursorIndex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), Marshal.addressToString.marshal(text, null), len, cursorIndex);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetSurroundingCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_surrounding}
     * @param setSurrounding The new value of the field {@code set_surrounding}
     */
    public void setSetSurrounding(SetSurroundingCallback setSurrounding) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSurrounding == null ? MemoryAddress.NULL : setSurrounding.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSurroundingCallback} callback.
     */
    @FunctionalInterface
    public interface GetSurroundingCallback {
    
        boolean run(org.gtk.gtk.IMContext context, Out<java.lang.String> text, Out<Integer> cursorIndex);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress text, MemoryAddress cursorIndex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<java.lang.String> textOUT = new Out<>(Marshal.addressToString.marshal(text, null));
                Out<Integer> cursorIndexOUT = new Out<>(cursorIndex.get(Interop.valueLayout.C_INT, 0));
                var RESULT = run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), textOUT, cursorIndexOUT);
                text.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(textOUT.get(), SCOPE));
                cursorIndex.set(Interop.valueLayout.C_INT, 0, cursorIndexOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSurroundingCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_surrounding}
     * @param getSurrounding The new value of the field {@code get_surrounding}
     */
    public void setGetSurrounding(GetSurroundingCallback getSurrounding) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSurrounding == null ? MemoryAddress.NULL : getSurrounding.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetSurroundingWithSelectionCallback} callback.
     */
    @FunctionalInterface
    public interface SetSurroundingWithSelectionCallback {
    
        void run(org.gtk.gtk.IMContext context, java.lang.String text, int len, int cursorIndex, int anchorIndex);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress text, int len, int cursorIndex, int anchorIndex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), Marshal.addressToString.marshal(text, null), len, cursorIndex, anchorIndex);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetSurroundingWithSelectionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_surrounding_with_selection}
     * @param setSurroundingWithSelection The new value of the field {@code set_surrounding_with_selection}
     */
    public void setSetSurroundingWithSelection(SetSurroundingWithSelectionCallback setSurroundingWithSelection) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_surrounding_with_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSurroundingWithSelection == null ? MemoryAddress.NULL : setSurroundingWithSelection.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSurroundingWithSelectionCallback} callback.
     */
    @FunctionalInterface
    public interface GetSurroundingWithSelectionCallback {
    
        boolean run(org.gtk.gtk.IMContext context, Out<java.lang.String> text, Out<Integer> cursorIndex, Out<Integer> anchorIndex);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress text, MemoryAddress cursorIndex, MemoryAddress anchorIndex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<java.lang.String> textOUT = new Out<>(Marshal.addressToString.marshal(text, null));
                Out<Integer> cursorIndexOUT = new Out<>(cursorIndex.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> anchorIndexOUT = new Out<>(anchorIndex.get(Interop.valueLayout.C_INT, 0));
                var RESULT = run((org.gtk.gtk.IMContext) Interop.register(context, org.gtk.gtk.IMContext.fromAddress).marshal(context, null), textOUT, cursorIndexOUT, anchorIndexOUT);
                text.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(textOUT.get(), SCOPE));
                cursorIndex.set(Interop.valueLayout.C_INT, 0, cursorIndexOUT.get());
                anchorIndex.set(Interop.valueLayout.C_INT, 0, anchorIndexOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSurroundingWithSelectionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_surrounding_with_selection}
     * @param getSurroundingWithSelection The new value of the field {@code get_surrounding_with_selection}
     */
    public void setGetSurroundingWithSelection(GetSurroundingWithSelectionCallback getSurroundingWithSelection) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surrounding_with_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSurroundingWithSelection == null ? MemoryAddress.NULL : getSurroundingWithSelection.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved1Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved1Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved1Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved1}
     * @param GtkReserved1 The new value of the field {@code _gtk_reserved1}
     */
    public void setGtkReserved1(GtkReserved1Callback GtkReserved1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved2Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved2Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved2Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved2}
     * @param GtkReserved2 The new value of the field {@code _gtk_reserved2}
     */
    public void setGtkReserved2(GtkReserved2Callback GtkReserved2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved3Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved3Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved3Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved3}
     * @param GtkReserved3 The new value of the field {@code _gtk_reserved3}
     */
    public void setGtkReserved3(GtkReserved3Callback GtkReserved3) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved4Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved4Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved4Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved4}
     * @param GtkReserved4 The new value of the field {@code _gtk_reserved4}
     */
    public void setGtkReserved4(GtkReserved4Callback GtkReserved4) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved5Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved5Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved5Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved5}
     * @param GtkReserved5 The new value of the field {@code _gtk_reserved5}
     */
    public void setGtkReserved5(GtkReserved5Callback GtkReserved5) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved5 == null ? MemoryAddress.NULL : GtkReserved5.toCallback()));
        }
    }
    
    /**
     * Create a IMContextClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected IMContextClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IMContextClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IMContextClass(input);
    
    /**
     * A {@link IMContextClass.Builder} object constructs a {@link IMContextClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link IMContextClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final IMContextClass struct;
        
        private Builder() {
            struct = IMContextClass.allocate();
        }
        
        /**
         * Finish building the {@link IMContextClass} struct.
         * @return A new instance of {@code IMContextClass} with the fields 
         *         that were set in the Builder object.
         */
        public IMContextClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setPreeditStart(PreeditStartCallback preeditStart) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("preedit_start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (preeditStart == null ? MemoryAddress.NULL : preeditStart.toCallback()));
                return this;
            }
        }
        
        public Builder setPreeditEnd(PreeditEndCallback preeditEnd) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("preedit_end"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (preeditEnd == null ? MemoryAddress.NULL : preeditEnd.toCallback()));
                return this;
            }
        }
        
        public Builder setPreeditChanged(PreeditChangedCallback preeditChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("preedit_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (preeditChanged == null ? MemoryAddress.NULL : preeditChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setCommit(CommitCallback commit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("commit"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (commit == null ? MemoryAddress.NULL : commit.toCallback()));
                return this;
            }
        }
        
        public Builder setRetrieveSurrounding(RetrieveSurroundingCallback retrieveSurrounding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("retrieve_surrounding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (retrieveSurrounding == null ? MemoryAddress.NULL : retrieveSurrounding.toCallback()));
                return this;
            }
        }
        
        public Builder setDeleteSurrounding(DeleteSurroundingCallback deleteSurrounding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("delete_surrounding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteSurrounding == null ? MemoryAddress.NULL : deleteSurrounding.toCallback()));
                return this;
            }
        }
        
        public Builder setSetClientWidget(SetClientWidgetCallback setClientWidget) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_client_widget"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setClientWidget == null ? MemoryAddress.NULL : setClientWidget.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPreeditString(GetPreeditStringCallback getPreeditString) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preedit_string"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreeditString == null ? MemoryAddress.NULL : getPreeditString.toCallback()));
                return this;
            }
        }
        
        public Builder setFilterKeypress(FilterKeypressCallback filterKeypress) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("filter_keypress"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (filterKeypress == null ? MemoryAddress.NULL : filterKeypress.toCallback()));
                return this;
            }
        }
        
        public Builder setFocusIn(FocusInCallback focusIn) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("focus_in"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (focusIn == null ? MemoryAddress.NULL : focusIn.toCallback()));
                return this;
            }
        }
        
        public Builder setFocusOut(FocusOutCallback focusOut) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("focus_out"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (focusOut == null ? MemoryAddress.NULL : focusOut.toCallback()));
                return this;
            }
        }
        
        public Builder setReset(ResetCallback reset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
                return this;
            }
        }
        
        public Builder setSetCursorLocation(SetCursorLocationCallback setCursorLocation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_cursor_location"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCursorLocation == null ? MemoryAddress.NULL : setCursorLocation.toCallback()));
                return this;
            }
        }
        
        public Builder setSetUsePreedit(SetUsePreeditCallback setUsePreedit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_use_preedit"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setUsePreedit == null ? MemoryAddress.NULL : setUsePreedit.toCallback()));
                return this;
            }
        }
        
        public Builder setSetSurrounding(SetSurroundingCallback setSurrounding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_surrounding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSurrounding == null ? MemoryAddress.NULL : setSurrounding.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSurrounding(GetSurroundingCallback getSurrounding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_surrounding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSurrounding == null ? MemoryAddress.NULL : getSurrounding.toCallback()));
                return this;
            }
        }
        
        public Builder setSetSurroundingWithSelection(SetSurroundingWithSelectionCallback setSurroundingWithSelection) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_surrounding_with_selection"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSurroundingWithSelection == null ? MemoryAddress.NULL : setSurroundingWithSelection.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSurroundingWithSelection(GetSurroundingWithSelectionCallback getSurroundingWithSelection) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_surrounding_with_selection"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSurroundingWithSelection == null ? MemoryAddress.NULL : getSurroundingWithSelection.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved1(GtkReserved1Callback GtkReserved1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved2(GtkReserved2Callback GtkReserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved3(GtkReserved3Callback GtkReserved3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved4(GtkReserved4Callback GtkReserved4) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved5(GtkReserved5Callback GtkReserved5) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved5 == null ? MemoryAddress.NULL : GtkReserved5.toCallback()));
                return this;
            }
        }
    }
}

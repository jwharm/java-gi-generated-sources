package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class EntryBufferClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEntryBufferClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("inserted_text"),
            Interop.valueLayout.ADDRESS.withName("deleted_text"),
            Interop.valueLayout.ADDRESS.withName("get_text"),
            Interop.valueLayout.ADDRESS.withName("get_length"),
            Interop.valueLayout.ADDRESS.withName("insert_text"),
            Interop.valueLayout.ADDRESS.withName("delete_text"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved4"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved5"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved6"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved7"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved8")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link EntryBufferClass}
     * @return A new, uninitialized @{link EntryBufferClass}
     */
    public static EntryBufferClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EntryBufferClass newInstance = new EntryBufferClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface InsertedTextCallback {
        void run(org.gtk.gtk.EntryBuffer buffer, int position, java.lang.String chars, int nChars);

        @ApiStatus.Internal default void upcall(MemoryAddress buffer, int position, MemoryAddress chars, int nChars) {
            run((org.gtk.gtk.EntryBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buffer)), org.gtk.gtk.EntryBuffer.fromAddress).marshal(buffer, Ownership.NONE), position, Marshal.addressToString.marshal(chars, null), nChars);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InsertedTextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code inserted_text}
     * @param insertedText The new value of the field {@code inserted_text}
     */
    public void setInsertedText(InsertedTextCallback insertedText) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("inserted_text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insertedText == null ? MemoryAddress.NULL : insertedText.toCallback()));
    }
    
    @FunctionalInterface
    public interface DeletedTextCallback {
        void run(org.gtk.gtk.EntryBuffer buffer, int position, int nChars);

        @ApiStatus.Internal default void upcall(MemoryAddress buffer, int position, int nChars) {
            run((org.gtk.gtk.EntryBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buffer)), org.gtk.gtk.EntryBuffer.fromAddress).marshal(buffer, Ownership.NONE), position, nChars);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeletedTextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code deleted_text}
     * @param deletedText The new value of the field {@code deleted_text}
     */
    public void setDeletedText(DeletedTextCallback deletedText) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deleted_text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deletedText == null ? MemoryAddress.NULL : deletedText.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetTextCallback {
        java.lang.String run(org.gtk.gtk.EntryBuffer buffer, PointerLong nBytes);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress buffer, MemoryAddress nBytes) {
            var RESULT = run((org.gtk.gtk.EntryBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buffer)), org.gtk.gtk.EntryBuffer.fromAddress).marshal(buffer, Ownership.NONE), new PointerLong(nBytes));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetTextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_text}
     * @param getText The new value of the field {@code get_text}
     */
    public void setGetText(GetTextCallback getText) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getText == null ? MemoryAddress.NULL : getText.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetLengthCallback {
        int run(org.gtk.gtk.EntryBuffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress buffer) {
            var RESULT = run((org.gtk.gtk.EntryBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buffer)), org.gtk.gtk.EntryBuffer.fromAddress).marshal(buffer, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetLengthCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_length}
     * @param getLength The new value of the field {@code get_length}
     */
    public void setGetLength(GetLengthCallback getLength) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getLength == null ? MemoryAddress.NULL : getLength.toCallback()));
    }
    
    @FunctionalInterface
    public interface InsertTextCallback {
        int run(org.gtk.gtk.EntryBuffer buffer, int position, java.lang.String chars, int nChars);

        @ApiStatus.Internal default int upcall(MemoryAddress buffer, int position, MemoryAddress chars, int nChars) {
            var RESULT = run((org.gtk.gtk.EntryBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buffer)), org.gtk.gtk.EntryBuffer.fromAddress).marshal(buffer, Ownership.NONE), position, Marshal.addressToString.marshal(chars, null), nChars);
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InsertTextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code insert_text}
     * @param insertText The new value of the field {@code insert_text}
     */
    public void setInsertText(InsertTextCallback insertText) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("insert_text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insertText == null ? MemoryAddress.NULL : insertText.toCallback()));
    }
    
    @FunctionalInterface
    public interface DeleteTextCallback {
        int run(org.gtk.gtk.EntryBuffer buffer, int position, int nChars);

        @ApiStatus.Internal default int upcall(MemoryAddress buffer, int position, int nChars) {
            var RESULT = run((org.gtk.gtk.EntryBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buffer)), org.gtk.gtk.EntryBuffer.fromAddress).marshal(buffer, Ownership.NONE), position, nChars);
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeleteTextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_text}
     * @param deleteText The new value of the field {@code delete_text}
     */
    public void setDeleteText(DeleteTextCallback deleteText) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delete_text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteText == null ? MemoryAddress.NULL : deleteText.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved1Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved1Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved1}
     * @param GtkReserved1 The new value of the field {@code _gtk_reserved1}
     */
    public void setGtkReserved1(GtkReserved1Callback GtkReserved1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved2Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved2Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved2}
     * @param GtkReserved2 The new value of the field {@code _gtk_reserved2}
     */
    public void setGtkReserved2(GtkReserved2Callback GtkReserved2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved3Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved3Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved3}
     * @param GtkReserved3 The new value of the field {@code _gtk_reserved3}
     */
    public void setGtkReserved3(GtkReserved3Callback GtkReserved3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved4Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved4Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved4}
     * @param GtkReserved4 The new value of the field {@code _gtk_reserved4}
     */
    public void setGtkReserved4(GtkReserved4Callback GtkReserved4) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved5Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved5Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved5}
     * @param GtkReserved5 The new value of the field {@code _gtk_reserved5}
     */
    public void setGtkReserved5(GtkReserved5Callback GtkReserved5) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved5 == null ? MemoryAddress.NULL : GtkReserved5.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved6Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved6Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved6}
     * @param GtkReserved6 The new value of the field {@code _gtk_reserved6}
     */
    public void setGtkReserved6(GtkReserved6Callback GtkReserved6) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved6 == null ? MemoryAddress.NULL : GtkReserved6.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved7Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved7Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved7}
     * @param GtkReserved7 The new value of the field {@code _gtk_reserved7}
     */
    public void setGtkReserved7(GtkReserved7Callback GtkReserved7) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved7 == null ? MemoryAddress.NULL : GtkReserved7.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved8Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved8Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved8}
     * @param GtkReserved8 The new value of the field {@code _gtk_reserved8}
     */
    public void setGtkReserved8(GtkReserved8Callback GtkReserved8) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved8 == null ? MemoryAddress.NULL : GtkReserved8.toCallback()));
    }
    
    /**
     * Create a EntryBufferClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EntryBufferClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, EntryBufferClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EntryBufferClass(input, ownership);
    
    /**
     * A {@link EntryBufferClass.Builder} object constructs a {@link EntryBufferClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link EntryBufferClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final EntryBufferClass struct;
        
        private Builder() {
            struct = EntryBufferClass.allocate();
        }
        
         /**
         * Finish building the {@link EntryBufferClass} struct.
         * @return A new instance of {@code EntryBufferClass} with the fields 
         *         that were set in the Builder object.
         */
        public EntryBufferClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setInsertedText(InsertedTextCallback insertedText) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("inserted_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insertedText == null ? MemoryAddress.NULL : insertedText.toCallback()));
            return this;
        }
        
        public Builder setDeletedText(DeletedTextCallback deletedText) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deleted_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deletedText == null ? MemoryAddress.NULL : deletedText.toCallback()));
            return this;
        }
        
        public Builder setGetText(GetTextCallback getText) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getText == null ? MemoryAddress.NULL : getText.toCallback()));
            return this;
        }
        
        public Builder setGetLength(GetLengthCallback getLength) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getLength == null ? MemoryAddress.NULL : getLength.toCallback()));
            return this;
        }
        
        public Builder setInsertText(InsertTextCallback insertText) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insertText == null ? MemoryAddress.NULL : insertText.toCallback()));
            return this;
        }
        
        public Builder setDeleteText(DeleteTextCallback deleteText) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteText == null ? MemoryAddress.NULL : deleteText.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved1(GtkReserved1Callback GtkReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved2(GtkReserved2Callback GtkReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved3(GtkReserved3Callback GtkReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved4(GtkReserved4Callback GtkReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved5(GtkReserved5Callback GtkReserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved5 == null ? MemoryAddress.NULL : GtkReserved5.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved6(GtkReserved6Callback GtkReserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved6 == null ? MemoryAddress.NULL : GtkReserved6.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved7(GtkReserved7Callback GtkReserved7) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved7 == null ? MemoryAddress.NULL : GtkReserved7.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved8(GtkReserved8Callback GtkReserved8) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved8 == null ? MemoryAddress.NULL : GtkReserved8.toCallback()));
            return this;
        }
    }
}

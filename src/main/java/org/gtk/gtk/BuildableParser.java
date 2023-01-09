package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A sub-parser for {@code GtkBuildable} implementations.
 */
public class BuildableParser extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuildableParser";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("start_element"),
            Interop.valueLayout.ADDRESS.withName("end_element"),
            Interop.valueLayout.ADDRESS.withName("text"),
            Interop.valueLayout.ADDRESS.withName("error"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BuildableParser}
     * @return A new, uninitialized @{link BuildableParser}
     */
    public static BuildableParser allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BuildableParser newInstance = new BuildableParser(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code StartElementCallback} callback.
     */
    @FunctionalInterface
    public interface StartElementCallback {
    
        void run(org.gtk.gtk.BuildableParseContext context, java.lang.String elementName, PointerString attributeNames, PointerString attributeValues);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress elementName, MemoryAddress attributeNames, MemoryAddress attributeValues, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(org.gtk.gtk.BuildableParseContext.fromAddress.marshal(context, null), Marshal.addressToString.marshal(elementName, null), new PointerString(attributeNames), new PointerString(attributeValues));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartElementCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_element}
     * @param startElement The new value of the field {@code start_element}
     */
    public void setStartElement(StartElementCallback startElement) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startElement == null ? MemoryAddress.NULL : startElement.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EndElementCallback} callback.
     */
    @FunctionalInterface
    public interface EndElementCallback {
    
        void run(org.gtk.gtk.BuildableParseContext context, java.lang.String elementName);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress elementName, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(org.gtk.gtk.BuildableParseContext.fromAddress.marshal(context, null), Marshal.addressToString.marshal(elementName, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EndElementCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code end_element}
     * @param endElement The new value of the field {@code end_element}
     */
    public void setEndElement(EndElementCallback endElement) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (endElement == null ? MemoryAddress.NULL : endElement.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TextCallback} callback.
     */
    @FunctionalInterface
    public interface TextCallback {
    
        void run(org.gtk.gtk.BuildableParseContext context, java.lang.String text, long textLen);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress text, long textLen, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(org.gtk.gtk.BuildableParseContext.fromAddress.marshal(context, null), Marshal.addressToString.marshal(text, null), textLen);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code text}
     * @param text The new value of the field {@code text}
     */
    public void setText(TextCallback text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (text == null ? MemoryAddress.NULL : text.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ErrorCallback} callback.
     */
    @FunctionalInterface
    public interface ErrorCallback {
    
        void run(org.gtk.gtk.BuildableParseContext context, org.gtk.glib.Error error);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress error, MemoryAddress userData) {
            run(org.gtk.gtk.BuildableParseContext.fromAddress.marshal(context, null), org.gtk.glib.Error.fromAddress.marshal(error, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ErrorCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code error}
     * @param error The new value of the field {@code error}
     */
    public void setError(ErrorCallback error) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (error == null ? MemoryAddress.NULL : error.toCallback()));
        }
    }
    
    /**
     * Create a BuildableParser proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BuildableParser(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BuildableParser> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BuildableParser(input);
    
    /**
     * A {@link BuildableParser.Builder} object constructs a {@link BuildableParser} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BuildableParser.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BuildableParser struct;
        
        private Builder() {
            struct = BuildableParser.allocate();
        }
        
        /**
         * Finish building the {@link BuildableParser} struct.
         * @return A new instance of {@code BuildableParser} with the fields 
         *         that were set in the Builder object.
         */
        public BuildableParser build() {
            return struct;
        }
        
        public Builder setStartElement(StartElementCallback startElement) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start_element"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startElement == null ? MemoryAddress.NULL : startElement.toCallback()));
                return this;
            }
        }
        
        public Builder setEndElement(EndElementCallback endElement) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("end_element"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (endElement == null ? MemoryAddress.NULL : endElement.toCallback()));
                return this;
            }
        }
        
        public Builder setText(TextCallback text) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("text"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (text == null ? MemoryAddress.NULL : text.toCallback()));
                return this;
            }
        }
        
        public Builder setError(ErrorCallback error) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("error"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (error == null ? MemoryAddress.NULL : error.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}

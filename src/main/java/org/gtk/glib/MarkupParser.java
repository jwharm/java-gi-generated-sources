package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Any of the fields in {@link MarkupParser} can be {@code null}, in which case they
 * will be ignored. Except for the {@code error} function, any of these callbacks
 * can set an error; in particular the {@link MarkupError#UNKNOWN_ELEMENT},
 * {@link MarkupError#UNKNOWN_ATTRIBUTE}, and {@link MarkupError#INVALID_CONTENT}
 * errors are intended to be set from these callbacks. If you set an error
 * from a callback, g_markup_parse_context_parse() will report that error
 * back to its caller.
 */
public class MarkupParser extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMarkupParser";
    
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
            Interop.valueLayout.ADDRESS.withName("passthrough"),
            Interop.valueLayout.ADDRESS.withName("error")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MarkupParser}
     * @return A new, uninitialized @{link MarkupParser}
     */
    public static MarkupParser allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MarkupParser newInstance = new MarkupParser(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code StartElementCallback} callback.
     */
    @FunctionalInterface
    public interface StartElementCallback {
    
        void run(org.gtk.glib.MarkupParseContext context, java.lang.String elementName, PointerString attributeNames, PointerString attributeValues);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress elementName, MemoryAddress attributeNames, MemoryAddress attributeValues, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(org.gtk.glib.MarkupParseContext.fromAddress.marshal(context, null), Marshal.addressToString.marshal(elementName, null), new PointerString(attributeNames), new PointerString(attributeValues));
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
    
        void run(org.gtk.glib.MarkupParseContext context, java.lang.String elementName);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress elementName, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(org.gtk.glib.MarkupParseContext.fromAddress.marshal(context, null), Marshal.addressToString.marshal(elementName, null));
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
    
        void run(org.gtk.glib.MarkupParseContext context, java.lang.String text, long textLen);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress text, long textLen, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(org.gtk.glib.MarkupParseContext.fromAddress.marshal(context, null), Marshal.addressToString.marshal(text, null), textLen);
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
     * Functional interface declaration of the {@code PassthroughCallback} callback.
     */
    @FunctionalInterface
    public interface PassthroughCallback {
    
        void run(org.gtk.glib.MarkupParseContext context, java.lang.String passthroughText, long textLen);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress passthroughText, long textLen, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(org.gtk.glib.MarkupParseContext.fromAddress.marshal(context, null), Marshal.addressToString.marshal(passthroughText, null), textLen);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PassthroughCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code passthrough}
     * @param passthrough The new value of the field {@code passthrough}
     */
    public void setPassthrough(PassthroughCallback passthrough) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("passthrough"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (passthrough == null ? MemoryAddress.NULL : passthrough.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ErrorCallback} callback.
     */
    @FunctionalInterface
    public interface ErrorCallback {
    
        void run(org.gtk.glib.MarkupParseContext context, org.gtk.glib.Error error);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress error, MemoryAddress userData) {
            run(org.gtk.glib.MarkupParseContext.fromAddress.marshal(context, null), org.gtk.glib.Error.fromAddress.marshal(error, null));
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
     * Create a MarkupParser proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MarkupParser(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MarkupParser> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MarkupParser(input);
    
    /**
     * A {@link MarkupParser.Builder} object constructs a {@link MarkupParser} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MarkupParser.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MarkupParser struct;
        
        private Builder() {
            struct = MarkupParser.allocate();
        }
        
        /**
         * Finish building the {@link MarkupParser} struct.
         * @return A new instance of {@code MarkupParser} with the fields 
         *         that were set in the Builder object.
         */
        public MarkupParser build() {
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
        
        public Builder setPassthrough(PassthroughCallback passthrough) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("passthrough"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (passthrough == null ? MemoryAddress.NULL : passthrough.toCallback()));
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
    }
}

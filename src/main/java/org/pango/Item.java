package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoItem} structure stores information about a segment of text.
 * <p>
 * You typically obtain {@code PangoItems} by itemizing a piece of text
 * with {@link Pango#itemize}.
 */
public class Item extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoItem";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("offset"),
            Interop.valueLayout.C_INT.withName("length"),
            Interop.valueLayout.C_INT.withName("num_chars"),
            MemoryLayout.paddingLayout(32),
            org.pango.Analysis.getMemoryLayout().withName("analysis")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Item}
     * @return A new, uninitialized @{link Item}
     */
    public static Item allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Item newInstance = new Item(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public int getOffset() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void setOffset(int offset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), offset);
        }
    }
    
    /**
     * Get the value of the field {@code length}
     * @return The value of the field {@code length}
     */
    public int getLength() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code length}
     * @param length The new value of the field {@code length}
     */
    public void setLength(int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), length);
        }
    }
    
    /**
     * Get the value of the field {@code num_chars}
     * @return The value of the field {@code num_chars}
     */
    public int getNumChars() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_chars"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code num_chars}
     * @param numChars The new value of the field {@code num_chars}
     */
    public void setNumChars(int numChars) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_chars"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), numChars);
        }
    }
    
    /**
     * Get the value of the field {@code analysis}
     * @return The value of the field {@code analysis}
     */
    public org.pango.Analysis getAnalysis() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("analysis"));
        return org.pango.Analysis.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code analysis}
     * @param analysis The new value of the field {@code analysis}
     */
    public void setAnalysis(org.pango.Analysis analysis) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("analysis"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (analysis == null ? MemoryAddress.NULL : analysis.handle()));
        }
    }
    
    /**
     * Create a Item proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Item(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Item> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Item(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_item_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code PangoItem} structure initialized to default values.
     */
    public Item() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Add attributes to a {@code PangoItem}.
     * <p>
     * The idea is that you have attributes that don't affect itemization,
     * such as font features, so you filter them out using
     * {@link AttrList#filter}, itemize your text, then reapply the
     * attributes to the resulting items using this function.
     * <p>
     * The {@code iter} should be positioned before the range of the item,
     * and will be advanced past it. This function is meant to be called
     * in a loop over the items resulting from itemization, while passing
     * the iter to each call.
     * @param iter a {@code PangoAttrIterator}
     */
    public void applyAttrs(org.pango.AttrIterator iter) {
        try {
            DowncallHandles.pango_item_apply_attrs.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Copy an existing {@code PangoItem} structure.
     * @return the newly allocated {@code PangoItem}
     */
    public @Nullable org.pango.Item copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_item_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.Item.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Free a {@code PangoItem} and all associated memory.
     */
    public void free() {
        try {
            DowncallHandles.pango_item_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Modifies {@code orig} to cover only the text after {@code split_index}, and
     * returns a new item that covers the text before {@code split_index} that
     * used to be in {@code orig}.
     * <p>
     * You can think of {@code split_index} as the length of the returned item.
     * {@code split_index} may not be 0, and it may not be greater than or equal
     * to the length of {@code orig} (that is, there must be at least one byte
     * assigned to each item, you can't create a zero-length item).
     * {@code split_offset} is the length of the first item in chars, and must be
     * provided because the text used to generate the item isn't available,
     * so {@code pango_item_split()} can't count the char length of the split items
     * itself.
     * @param splitIndex byte index of position to split item, relative to the
     *   start of the item
     * @param splitOffset number of chars between start of {@code orig} and {@code split_index}
     * @return new item representing text before {@code split_index}, which
     *   should be freed with {@link Item#free}.
     */
    public org.pango.Item split(int splitIndex, int splitOffset) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_item_split.invokeExact(
                    handle(),
                    splitIndex,
                    splitOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.Item.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_item_new = Interop.downcallHandle(
                "pango_item_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_item_apply_attrs = Interop.downcallHandle(
                "pango_item_apply_attrs",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_item_copy = Interop.downcallHandle(
                "pango_item_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_item_free = Interop.downcallHandle(
                "pango_item_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_item_split = Interop.downcallHandle(
                "pango_item_split",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * A {@link Item.Builder} object constructs a {@link Item} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Item.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Item struct;
        
        private Builder() {
            struct = Item.allocate();
        }
        
        /**
         * Finish building the {@link Item} struct.
         * @return A new instance of {@code Item} with the fields 
         *         that were set in the Builder object.
         */
        public Item build() {
            return struct;
        }
        
        /**
         * byte offset of the start of this item in text.
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(int offset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), offset);
                return this;
            }
        }
        
        /**
         * length of this item in bytes.
         * @param length The value for the {@code length} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLength(int length) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("length"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), length);
                return this;
            }
        }
        
        /**
         * number of Unicode characters in the item.
         * @param numChars The value for the {@code numChars} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNumChars(int numChars) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("num_chars"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), numChars);
                return this;
            }
        }
        
        /**
         * analysis results for the item.
         * @param analysis The value for the {@code analysis} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAnalysis(org.pango.Analysis analysis) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("analysis"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (analysis == null ? MemoryAddress.NULL : analysis.handle()));
                return this;
            }
        }
    }
}

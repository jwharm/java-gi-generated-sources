package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TocEntry extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTocEntry";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TocEntry}
     * @return A new, uninitialized @{link TocEntry}
     */
    public static TocEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TocEntry newInstance = new TocEntry(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TocEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TocEntry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gst.TocEntryType type, @NotNull java.lang.String uid) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(uid, "Parameter 'uid' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_entry_new.invokeExact(
                    type.getValue(),
                    Interop.allocateNativeString(uid));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create new {@link TocEntry} structure.
     * @param type entry type.
     * @param uid unique ID (UID) in the whole TOC.
     */
    public TocEntry(@NotNull org.gstreamer.gst.TocEntryType type, @NotNull java.lang.String uid) {
        super(constructNew(type, uid), Ownership.FULL);
    }
    
    /**
     * Appends the {@link TocEntry} {@code subentry} to {@code entry}.
     * @param subentry A {@link TocEntry}
     */
    public void appendSubEntry(@NotNull org.gstreamer.gst.TocEntry subentry) {
        java.util.Objects.requireNonNull(subentry, "Parameter 'subentry' must not be null");
        try {
            DowncallHandles.gst_toc_entry_append_sub_entry.invokeExact(
                    handle(),
                    subentry.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        subentry.yieldOwnership();
    }
    
    public @NotNull org.gstreamer.gst.TocEntryType getEntryType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_toc_entry_get_entry_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TocEntryType(RESULT);
    }
    
    /**
     * Get {@code loop_type} and {@code repeat_count} values from the {@code entry} and write them into
     * appropriate storages. Loops are e.g. used by sampled instruments. GStreamer
     * is not automatically applying the loop. The application can process this
     * meta data and use it e.g. to send a seek-event to loop a section.
     * @param loopType the storage for the loop_type
     *             value, leave {@code null} if not need.
     * @param repeatCount the storage for the repeat_count
     *                value, leave {@code null} if not need.
     * @return {@code true} if all non-{@code null} storage pointers were filled with appropriate
     * values, {@code false} otherwise.
     */
    public boolean getLoop(@NotNull Out<org.gstreamer.gst.TocLoopType> loopType, Out<Integer> repeatCount) {
        java.util.Objects.requireNonNull(loopType, "Parameter 'loopType' must not be null");
        MemorySegment loopTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(repeatCount, "Parameter 'repeatCount' must not be null");
        MemorySegment repeatCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_toc_entry_get_loop.invokeExact(
                    handle(),
                    (Addressable) loopTypePOINTER.address(),
                    (Addressable) repeatCountPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        loopType.set(new org.gstreamer.gst.TocLoopType(loopTypePOINTER.get(Interop.valueLayout.C_INT, 0)));
        repeatCount.set(repeatCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the parent {@link TocEntry} of {@code entry}.
     * @return The parent {@link TocEntry} of {@code entry}
     */
    public @Nullable org.gstreamer.gst.TocEntry getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_entry_get_parent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TocEntry(RESULT, Ownership.NONE);
    }
    
    /**
     * Get {@code start} and {@code stop} values from the {@code entry} and write them into appropriate
     * storages.
     * @param start the storage for the start value, leave
     *   {@code null} if not need.
     * @param stop the storage for the stop value, leave
     *   {@code null} if not need.
     * @return {@code true} if all non-{@code null} storage pointers were filled with appropriate
     * values, {@code false} otherwise.
     */
    public boolean getStartStopTimes(Out<Long> start, Out<Long> stop) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        MemorySegment startPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(stop, "Parameter 'stop' must not be null");
        MemorySegment stopPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_toc_entry_get_start_stop_times.invokeExact(
                    handle(),
                    (Addressable) startPOINTER.address(),
                    (Addressable) stopPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        start.set(startPOINTER.get(Interop.valueLayout.C_LONG, 0));
        stop.set(stopPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the sub-entries of {@code entry}.
     * @return A {@link org.gtk.glib.List} of {@link TocEntry} of {@code entry}
     */
    public @NotNull org.gtk.glib.List getSubEntries() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_entry_get_sub_entries.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the tags for {@code entry}.
     * @return A {@link TagList} for {@code entry}
     */
    public @NotNull org.gstreamer.gst.TagList getTags() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_entry_get_tags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TagList(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the parent {@link Toc} of {@code entry}.
     * @return The parent {@link Toc} of {@code entry}
     */
    public @NotNull org.gstreamer.gst.Toc getToc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_entry_get_toc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Toc(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the UID of {@code entry}.
     * @return The UID of {@code entry}
     */
    public @NotNull java.lang.String getUid() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_entry_get_uid.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public boolean isAlternative() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_toc_entry_is_alternative.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public boolean isSequence() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_toc_entry_is_sequence.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Merge {@code tags} into the existing tags of {@code entry} using {@code mode}.
     * @param tags A {@link TagList} or {@code null}
     * @param mode A {@link TagMergeMode}
     */
    public void mergeTags(@Nullable org.gstreamer.gst.TagList tags, @NotNull org.gstreamer.gst.TagMergeMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gst_toc_entry_merge_tags.invokeExact(
                    handle(),
                    (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code loop_type} and {@code repeat_count} values for the {@code entry}.
     * @param loopType loop_type value to set.
     * @param repeatCount repeat_count value to set.
     */
    public void setLoop(@NotNull org.gstreamer.gst.TocLoopType loopType, int repeatCount) {
        java.util.Objects.requireNonNull(loopType, "Parameter 'loopType' must not be null");
        try {
            DowncallHandles.gst_toc_entry_set_loop.invokeExact(
                    handle(),
                    loopType.getValue(),
                    repeatCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code start} and {@code stop} values for the {@code entry}.
     * @param start start value to set.
     * @param stop stop value to set.
     */
    public void setStartStopTimes(long start, long stop) {
        try {
            DowncallHandles.gst_toc_entry_set_start_stop_times.invokeExact(
                    handle(),
                    start,
                    stop);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set a {@link TagList} with tags for the complete {@code entry}.
     * @param tags A {@link TagList} or {@code null}
     */
    public void setTags(@Nullable org.gstreamer.gst.TagList tags) {
        try {
            DowncallHandles.gst_toc_entry_set_tags.invokeExact(
                    handle(),
                    (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tags.yieldOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_toc_entry_new = Interop.downcallHandle(
            "gst_toc_entry_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_append_sub_entry = Interop.downcallHandle(
            "gst_toc_entry_append_sub_entry",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_get_entry_type = Interop.downcallHandle(
            "gst_toc_entry_get_entry_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_get_loop = Interop.downcallHandle(
            "gst_toc_entry_get_loop",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_get_parent = Interop.downcallHandle(
            "gst_toc_entry_get_parent",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_get_start_stop_times = Interop.downcallHandle(
            "gst_toc_entry_get_start_stop_times",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_get_sub_entries = Interop.downcallHandle(
            "gst_toc_entry_get_sub_entries",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_get_tags = Interop.downcallHandle(
            "gst_toc_entry_get_tags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_get_toc = Interop.downcallHandle(
            "gst_toc_entry_get_toc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_get_uid = Interop.downcallHandle(
            "gst_toc_entry_get_uid",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_is_alternative = Interop.downcallHandle(
            "gst_toc_entry_is_alternative",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_is_sequence = Interop.downcallHandle(
            "gst_toc_entry_is_sequence",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_entry_merge_tags = Interop.downcallHandle(
            "gst_toc_entry_merge_tags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_toc_entry_set_loop = Interop.downcallHandle(
            "gst_toc_entry_set_loop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_toc_entry_set_start_stop_times = Interop.downcallHandle(
            "gst_toc_entry_set_start_stop_times",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_toc_entry_set_tags = Interop.downcallHandle(
            "gst_toc_entry_set_tags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TocEntry struct;
        
         /**
         * A {@link TocEntry.Build} object constructs a {@link TocEntry} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TocEntry.allocate();
        }
        
         /**
         * Finish building the {@link TocEntry} struct.
         * @return A new instance of {@code TocEntry} with the fields 
         *         that were set in the Build object.
         */
        public TocEntry construct() {
            return struct;
        }
    }
}

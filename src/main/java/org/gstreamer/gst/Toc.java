package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Toc} functions are used to create/free {@link Toc} and {@link TocEntry} structures.
 * Also they are used to convert {@link Toc} into {@link Structure} and vice versa.
 * <p>
 * {@link Toc} lets you to inform other elements in pipeline or application that playing
 * source has some kind of table of contents (TOC). These may be chapters, editions,
 * angles or other types. For example: DVD chapters, Matroska chapters or cue sheet
 * TOC. Such TOC will be useful for applications to display instead of just a
 * playlist.
 * <p>
 * Using TOC is very easy. Firstly, create {@link Toc} structure which represents root
 * contents of the source. You can also attach TOC-specific tags to it. Then fill
 * it with {@link TocEntry} entries by appending them to the {@link Toc} using
 * gst_toc_append_entry(), and appending subentries to a {@link TocEntry} using
 * gst_toc_entry_append_sub_entry().
 * <p>
 * Note that root level of the TOC can contain only either editions or chapters. You
 * should not mix them together at the same level. Otherwise you will get serialization
 * /deserialization errors. Make sure that no one of the entries has negative start and
 *  stop values.
 * <p>
 * Use gst_event_new_toc() to create a new TOC {@link Event}, and gst_event_parse_toc() to
 * parse received TOC event. Use gst_event_new_toc_select() to create a new TOC select {@link Event},
 * and gst_event_parse_toc_select() to parse received TOC select event. The same rule for
 * the {@link Message}: gst_message_new_toc() to create new TOC {@link Message}, and
 * gst_message_parse_toc() to parse received TOC message.
 * <p>
 * TOCs can have global scope or current scope. Global scope TOCs contain
 * all entries that can possibly be selected using a toc select event, and
 * are what an application is usually interested in. TOCs with current scope
 * only contain the parts of the TOC relevant to the currently selected/playing
 * stream; the current scope TOC is used by downstream elements such as muxers
 * to write correct TOC entries when transcoding files, for example. When
 * playing a DVD, the global TOC would contain a hierarchy of all titles,
 * chapters and angles, for example, while the current TOC would only contain
 * the chapters for the currently playing title if playback of a specific
 * title was requested.
 * <p>
 * Applications and plugins should not rely on TOCs having a certain kind of
 * structure, but should allow for different alternatives. For example, a
 * simple CUE sheet embedded in a file may be presented as a flat list of
 * track entries, or could have a top-level edition node (or some other
 * alternative type entry) with track entries underneath that node; or even
 * multiple top-level edition nodes (or some other alternative type entries)
 * each with track entries underneath, in case the source file has extracted
 * a track listing from different sources).
 */
public class Toc extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstToc";
    
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
     * Allocate a new {@link Toc}
     * @return A new, uninitialized @{link Toc}
     */
    public static Toc allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Toc newInstance = new Toc(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Toc proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Toc(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gst.TocScope scope) {
        java.util.Objects.requireNonNull(scope, "Parameter 'scope' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_new.invokeExact(
                    scope.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link Toc} structure.
     * @param scope scope of this TOC
     */
    public Toc(@NotNull org.gstreamer.gst.TocScope scope) {
        super(constructNew(scope), Ownership.FULL);
    }
    
    /**
     * Appends the {@link TocEntry} {@code entry} to {@code toc}.
     * @param entry A {@link TocEntry}
     */
    public void appendEntry(@NotNull org.gstreamer.gst.TocEntry entry) {
        java.util.Objects.requireNonNull(entry, "Parameter 'entry' must not be null");
        try {
            DowncallHandles.gst_toc_append_entry.invokeExact(
                    handle(),
                    entry.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        entry.yieldOwnership();
    }
    
    public void dump() {
        try {
            DowncallHandles.gst_toc_dump.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Find {@link TocEntry} with given {@code uid} in the {@code toc}.
     * @param uid UID to find {@link TocEntry} with.
     * @return {@link TocEntry} with specified
     * {@code uid} from the {@code toc}, or {@code null} if not found.
     */
    public @Nullable org.gstreamer.gst.TocEntry findEntry(@NotNull java.lang.String uid) {
        java.util.Objects.requireNonNull(uid, "Parameter 'uid' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_find_entry.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uid));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TocEntry(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the list of {@link TocEntry} of {@code toc}.
     * @return A {@link org.gtk.glib.List} of {@link TocEntry} for {@code entry}
     */
    public @NotNull org.gtk.glib.List getEntries() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_get_entries.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    public @NotNull org.gstreamer.gst.TocScope getScope() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_toc_get_scope.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.TocScope.of(RESULT);
    }
    
    /**
     * Gets the tags for {@code toc}.
     * @return A {@link TagList} for {@code entry}
     */
    public @NotNull org.gstreamer.gst.TagList getTags() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_toc_get_tags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TagList(RESULT, Ownership.NONE);
    }
    
    /**
     * Merge {@code tags} into the existing tags of {@code toc} using {@code mode}.
     * @param tags A {@link TagList} or {@code null}
     * @param mode A {@link TagMergeMode}
     */
    public void mergeTags(@Nullable org.gstreamer.gst.TagList tags, @NotNull org.gstreamer.gst.TagMergeMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gst_toc_merge_tags.invokeExact(
                    handle(),
                    (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set a {@link TagList} with tags for the complete {@code toc}.
     * @param tags A {@link TagList} or {@code null}
     */
    public void setTags(@Nullable org.gstreamer.gst.TagList tags) {
        try {
            DowncallHandles.gst_toc_set_tags.invokeExact(
                    handle(),
                    (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tags.yieldOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_toc_new = Interop.downcallHandle(
            "gst_toc_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_toc_append_entry = Interop.downcallHandle(
            "gst_toc_append_entry",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_dump = Interop.downcallHandle(
            "gst_toc_dump",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_find_entry = Interop.downcallHandle(
            "gst_toc_find_entry",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_get_entries = Interop.downcallHandle(
            "gst_toc_get_entries",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_get_scope = Interop.downcallHandle(
            "gst_toc_get_scope",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_get_tags = Interop.downcallHandle(
            "gst_toc_get_tags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_toc_merge_tags = Interop.downcallHandle(
            "gst_toc_merge_tags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_toc_set_tags = Interop.downcallHandle(
            "gst_toc_set_tags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}

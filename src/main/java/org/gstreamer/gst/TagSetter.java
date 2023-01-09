package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Element interface that allows setting of media metadata.
 * <p>
 * Elements that support changing a stream's metadata will implement this
 * interface. Examples of such elements are 'vorbisenc', 'theoraenc' and
 * 'id3v2mux'.
 * <p>
 * If you just want to retrieve metadata in your application then all you
 * need to do is watch for tag messages on your pipeline's bus. This
 * interface is only for setting metadata, not for extracting it. To set tags
 * from the application, find tagsetter elements and set tags using e.g.
 * gst_tag_setter_merge_tags() or gst_tag_setter_add_tags(). Also consider
 * setting the {@link TagMergeMode} that is used for tag events that arrive at the
 * tagsetter element (default mode is to keep existing tags).
 * The application should do that before the element goes to {@link State#PAUSED}.
 * <p>
 * Elements implementing the {@link TagSetter} interface often have to merge
 * any tags received from upstream and the tags set by the application via
 * the interface. This can be done like this:
 * <pre>{@code <!-- language="C" -->
 * GstTagMergeMode merge_mode;
 * const GstTagList *application_tags;
 * const GstTagList *event_tags;
 * GstTagSetter *tagsetter;
 * GstTagList *result;
 * 
 * tagsetter = GST_TAG_SETTER (element);
 * 
 * merge_mode = gst_tag_setter_get_tag_merge_mode (tagsetter);
 * application_tags = gst_tag_setter_get_tag_list (tagsetter);
 * event_tags = (const GstTagList *) element->event_tags;
 * 
 * GST_LOG_OBJECT (tagsetter, "merging tags, merge mode = %d", merge_mode);
 * GST_LOG_OBJECT (tagsetter, "event tags: %" GST_PTR_FORMAT, event_tags);
 * GST_LOG_OBJECT (tagsetter, "set   tags: %" GST_PTR_FORMAT, application_tags);
 * 
 * result = gst_tag_list_merge (application_tags, event_tags, merge_mode);
 * 
 * GST_LOG_OBJECT (tagsetter, "final tags: %" GST_PTR_FORMAT, result);
 * }</pre>
 */
public interface TagSetter extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TagSetterImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TagSetterImpl(input);
    
    /**
     * Adds the given tag / value pairs on the setter using the given merge mode.
     * The list must be terminated with {@code null}.
     * @param mode the mode to use
     * @param tag tag to set
     * @param varArgs tag / value pairs to set
     */
    default void addTagValist(org.gstreamer.gst.TagMergeMode mode, java.lang.String tag, VaList varArgs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_tag_setter_add_tag_valist.invokeExact(
                        handle(),
                        mode.getValue(),
                        Marshal.stringToAddress.marshal(tag, SCOPE),
                        varArgs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds the given tag / GValue pairs on the setter using the given merge mode.
     * The list must be terminated with {@code null}.
     * @param mode the mode to use
     * @param tag tag to set
     * @param varArgs tag / GValue pairs to set
     */
    default void addTagValistValues(org.gstreamer.gst.TagMergeMode mode, java.lang.String tag, VaList varArgs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_tag_setter_add_tag_valist_values.invokeExact(
                        handle(),
                        mode.getValue(),
                        Marshal.stringToAddress.marshal(tag, SCOPE),
                        varArgs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds the given tag / GValue pair on the setter using the given merge mode.
     * @param mode the mode to use
     * @param tag tag to set
     * @param value GValue to set for the tag
     */
    default void addTagValue(org.gstreamer.gst.TagMergeMode mode, java.lang.String tag, org.gtk.gobject.Value value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_tag_setter_add_tag_value.invokeExact(
                        handle(),
                        mode.getValue(),
                        Marshal.stringToAddress.marshal(tag, SCOPE),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds the given tag / GValue pairs on the setter using the given merge mode.
     * The list must be terminated with {@code null}.
     * @param mode the mode to use
     * @param tag tag to set
     * @param varargs more tag / GValue pairs to set
     */
    default void addTagValues(org.gstreamer.gst.TagMergeMode mode, java.lang.String tag, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_tag_setter_add_tag_values.invokeExact(
                        handle(),
                        mode.getValue(),
                        Marshal.stringToAddress.marshal(tag, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds the given tag / value pairs on the setter using the given merge mode.
     * The list must be terminated with {@code null}.
     * @param mode the mode to use
     * @param tag tag to set
     * @param varargs more tag / value pairs to set
     */
    default void addTags(org.gstreamer.gst.TagMergeMode mode, java.lang.String tag, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_tag_setter_add_tags.invokeExact(
                        handle(),
                        mode.getValue(),
                        Marshal.stringToAddress.marshal(tag, SCOPE),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Returns the current list of tags the setter uses.  The list should not be
     * modified or freed.
     * <p>
     * This function is not thread-safe.
     * @return a current snapshot of the
     *          taglist used in the setter or {@code null} if none is used.
     */
    default @Nullable org.gstreamer.gst.TagList getTagList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_setter_get_tag_list.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Queries the mode by which tags inside the setter are overwritten by tags
     * from events
     * @return the merge mode used inside the element.
     */
    default org.gstreamer.gst.TagMergeMode getTagMergeMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_setter_get_tag_merge_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.TagMergeMode.of(RESULT);
    }
    
    /**
     * Merges the given list into the setter's list using the given mode.
     * @param list a tag list to merge from
     * @param mode the mode to merge with
     */
    default void mergeTags(org.gstreamer.gst.TagList list, org.gstreamer.gst.TagMergeMode mode) {
        try {
            DowncallHandles.gst_tag_setter_merge_tags.invokeExact(
                    handle(),
                    list.handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reset the internal taglist. Elements should call this from within the
     * state-change handler.
     */
    default void resetTags() {
        try {
            DowncallHandles.gst_tag_setter_reset_tags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the given merge mode that is used for adding tags from events to tags
     * specified by this interface. The default is {@code GST_TAG_MERGE_KEEP}, which keeps
     * the tags set with this interface and discards tags from events.
     * @param mode The mode with which tags are added
     */
    default void setTagMergeMode(org.gstreamer.gst.TagMergeMode mode) {
        try {
            DowncallHandles.gst_tag_setter_set_tag_merge_mode.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tag_setter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_add_tag_valist = Interop.downcallHandle(
                "gst_tag_setter_add_tag_valist",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_add_tag_valist_values = Interop.downcallHandle(
                "gst_tag_setter_add_tag_valist_values",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_add_tag_value = Interop.downcallHandle(
                "gst_tag_setter_add_tag_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_add_tag_values = Interop.downcallHandle(
                "gst_tag_setter_add_tag_values",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_add_tags = Interop.downcallHandle(
                "gst_tag_setter_add_tags",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_get_tag_list = Interop.downcallHandle(
                "gst_tag_setter_get_tag_list",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_get_tag_merge_mode = Interop.downcallHandle(
                "gst_tag_setter_get_tag_merge_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_merge_tags = Interop.downcallHandle(
                "gst_tag_setter_merge_tags",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_reset_tags = Interop.downcallHandle(
                "gst_tag_setter_reset_tags",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_set_tag_merge_mode = Interop.downcallHandle(
                "gst_tag_setter_set_tag_merge_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_setter_get_type = Interop.downcallHandle(
                "gst_tag_setter_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The TagSetterImpl type represents a native instance of the TagSetter interface.
     */
    class TagSetterImpl extends org.gtk.gobject.GObject implements TagSetter {
        
        static {
            Gst.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of TagSetter for the provided memory address.
         * @param address the memory address of the instance
         */
        public TagSetterImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_tag_setter_get_type != null;
    }
}

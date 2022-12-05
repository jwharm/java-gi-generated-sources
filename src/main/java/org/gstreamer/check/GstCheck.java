package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstCheck namespace.
 */
public final class GstCheck {
    
    static {
        System.loadLibrary("gstcheck-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    /**
     * Get one buffer from {@code pad}. Implemented via buffer probes. This function will
     * block until the pipeline passes a buffer over {@code pad}, so for robust behavior
     * in unit tests, you need to use check's timeout to fail out in the case that a
     * buffer never arrives.
     * <p>
     * You must have previously called gst_buffer_straw_start_pipeline() on
     * {@code pipeline} and {@code pad}.
     * @param bin the pipeline previously started via gst_buffer_straw_start_pipeline()
     * @param pad the pad previously passed to gst_buffer_straw_start_pipeline()
     * @return the captured {@link org.gstreamer.gst.Buffer}.
     */
    public static @NotNull org.gstreamer.gst.Buffer bufferStrawGetBuffer(@NotNull org.gstreamer.gst.Element bin, @NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(bin, "Parameter 'bin' must not be null");
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_straw_get_buffer.invokeExact(
                    bin.handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets up a pipeline for buffer sucking. This will allow you to call
     * gst_buffer_straw_get_buffer() to access buffers as they pass over {@code pad}.
     * <p>
     * This function is normally used in unit tests that want to verify that a
     * particular element is outputting correct buffers. For example, you would make
     * a pipeline via gst_parse_launch(), pull out the pad you want to monitor, then
     * call gst_buffer_straw_get_buffer() to get the buffers that pass through {@code pad}.
     * The pipeline will block until you have sucked off the buffers.
     * <p>
     * This function will set the state of {@code bin} to PLAYING; to clean up, be sure to
     * call gst_buffer_straw_stop_pipeline().
     * <p>
     * Note that you may not start two buffer straws at the same time. This function
     * is intended for unit tests, not general API use. In fact it calls fail_if
     * from libcheck, so you cannot use it outside unit tests.
     * @param bin the pipeline to run
     * @param pad a pad on an element in {@code bin}
     */
    public static void bufferStrawStartPipeline(@NotNull org.gstreamer.gst.Element bin, @NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(bin, "Parameter 'bin' must not be null");
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        try {
            DowncallHandles.gst_buffer_straw_start_pipeline.invokeExact(
                    bin.handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code bin} to {@code GST_STATE_NULL} and release resource allocated in
     * gst_buffer_straw_start_pipeline().
     * <p>
     * You must have previously called gst_buffer_straw_start_pipeline() on
     * {@code pipeline} and {@code pad}.
     * @param bin the pipeline previously started via gst_buffer_straw_start_pipeline()
     * @param pad the pad previously passed to gst_buffer_straw_start_pipeline()
     */
    public static void bufferStrawStopPipeline(@NotNull org.gstreamer.gst.Element bin, @NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(bin, "Parameter 'bin' must not be null");
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        try {
            DowncallHandles.gst_buffer_straw_stop_pipeline.invokeExact(
                    bin.handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Verifies that reference values and current values are equals in {@code list}.
     * @param list A list of GstCheckABIStruct to be verified
     * @param haveAbiSizes Whether there is a reference ABI size already specified,
     * if it is {@code false} and the {@code GST_ABI} environment variable is set, usable code
     * for {@code list} will be printed.
     */
    public static void checkAbiList(@NotNull org.gstreamer.check.CheckABIStruct list, boolean haveAbiSizes) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        try {
            DowncallHandles.gst_check_abi_list.invokeExact(
                    list.handle(),
                    haveAbiSizes ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Add a callback {@code func} to be called for all log messages that matches
     * {@code log_domain}, {@code log_level} and {@code regex}. If {@code func} is NULL the
     * matching logs will be silently discarded by GstCheck.
     * <p>
     * MT safe.
     * @param logDomain the log domain of the message
     * @param logLevel the log level of the message
     * @param regex a {@link org.gtk.glib.Regex} to match the message
     * @param func the function to call for matching messages
     * @return A filter that can be passed to {@code gst_check_remove_log_filter}.
     */
    public static @NotNull org.gstreamer.check.CheckLogFilter checkAddLogFilter(@NotNull java.lang.String logDomain, @NotNull org.gtk.glib.LogLevelFlags logLevel, @NotNull org.gtk.glib.Regex regex, @NotNull org.gstreamer.check.CheckLogFilterFunc func) {
        java.util.Objects.requireNonNull(logDomain, "Parameter 'logDomain' must not be null");
        java.util.Objects.requireNonNull(logLevel, "Parameter 'logLevel' must not be null");
        java.util.Objects.requireNonNull(regex, "Parameter 'regex' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_check_add_log_filter.invokeExact(
                    Interop.allocateNativeString(logDomain),
                    logLevel.getValue(),
                    regex.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstCheck.Callbacks.class, "cbCheckLogFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        regex.yieldOwnership();
        return new org.gstreamer.check.CheckLogFilter(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Compare the buffer contents with {@code data} and {@code size}.
     * @param buffer buffer to compare
     * @param data data to compare to
     * @param size size of data to compare
     */
    public static void checkBufferData(@NotNull org.gstreamer.gst.Buffer buffer, @Nullable java.lang.foreign.MemoryAddress data, long size) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        try {
            DowncallHandles.gst_check_buffer_data.invokeExact(
                    buffer.handle(),
                    (Addressable) data,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compare two caps with gst_caps_is_equal and fail unless they are
     * equal.
     * @param caps1 first caps to compare
     * @param caps2 second caps to compare
     */
    public static void checkCapsEqual(@NotNull org.gstreamer.gst.Caps caps1, @NotNull org.gstreamer.gst.Caps caps2) {
        java.util.Objects.requireNonNull(caps1, "Parameter 'caps1' must not be null");
        java.util.Objects.requireNonNull(caps2, "Parameter 'caps2' must not be null");
        try {
            DowncallHandles.gst_check_caps_equal.invokeExact(
                    caps1.handle(),
                    caps2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A fake chain function that appends the buffer to the internal list of
     * buffers.
     */
    public static @NotNull org.gstreamer.gst.FlowReturn checkChainFunc(@NotNull org.gstreamer.gst.Pad pad, @NotNull org.gstreamer.gst.Object parent, @NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        java.util.Objects.requireNonNull(parent, "Parameter 'parent' must not be null");
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_check_chain_func.invokeExact(
                    pad.handle(),
                    parent.handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Clear all filters added by {@code gst_check_add_log_filter}.
     * <p>
     * MT safe.
     */
    public static void checkClearLogFilter() {
        try {
            DowncallHandles.gst_check_clear_log_filter.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unref and remove all buffers that are in the global {@code buffers} GList,
     * emptying the list.
     */
    public static void checkDropBuffers() {
        try {
            DowncallHandles.gst_check_drop_buffers.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create an element using the factory providing the {@code element_name} and
     * push the {@code buffer_in} to this element. The element should create one buffer
     * and this will be compared with {@code buffer_out}. We only check the caps
     * and the data of the buffers. This function unrefs the buffers.
     * @param elementName name of the element that needs to be created
     * @param bufferIn push this buffer to the element
     * @param capsIn the {@link org.gstreamer.gst.Caps} expected of the sinkpad of the element
     * @param bufferOut compare the result with this buffer
     * @param capsOut the {@link org.gstreamer.gst.Caps} expected of the srcpad of the element
     */
    public static void checkElementPushBuffer(@NotNull java.lang.String elementName, @NotNull org.gstreamer.gst.Buffer bufferIn, @NotNull org.gstreamer.gst.Caps capsIn, @NotNull org.gstreamer.gst.Buffer bufferOut, @NotNull org.gstreamer.gst.Caps capsOut) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        java.util.Objects.requireNonNull(bufferIn, "Parameter 'bufferIn' must not be null");
        java.util.Objects.requireNonNull(capsIn, "Parameter 'capsIn' must not be null");
        java.util.Objects.requireNonNull(bufferOut, "Parameter 'bufferOut' must not be null");
        java.util.Objects.requireNonNull(capsOut, "Parameter 'capsOut' must not be null");
        try {
            DowncallHandles.gst_check_element_push_buffer.invokeExact(
                    Interop.allocateNativeString(elementName),
                    bufferIn.handle(),
                    capsIn.handle(),
                    bufferOut.handle(),
                    capsOut.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create an element using the factory providing the {@code element_name} and push the
     * buffers in {@code buffer_in} to this element. The element should create the buffers
     * equal to the buffers in {@code buffer_out}. We only check the size and the data of
     * the buffers. This function unrefs the buffers in the two lists.
     * The last_flow_return parameter indicates the expected flow return value from
     * pushing the final buffer in the list.
     * This can be used to set up a test which pushes some buffers and then an
     * invalid buffer, when the final buffer is expected to fail, for example.
     * @param elementName name of the element that needs to be created
     * @param bufferIn a list of buffers that needs to be
     *  pushed to the element
     * @param capsIn the {@link org.gstreamer.gst.Caps} expected of the sinkpad of the element
     * @param bufferOut a list of buffers that we expect from
     * the element
     * @param capsOut the {@link org.gstreamer.gst.Caps} expected of the srcpad of the element
     * @param lastFlowReturn the last buffer push needs to give this GstFlowReturn
     */
    public static void checkElementPushBufferList(@NotNull java.lang.String elementName, @NotNull org.gtk.glib.List bufferIn, @NotNull org.gstreamer.gst.Caps capsIn, @NotNull org.gtk.glib.List bufferOut, @NotNull org.gstreamer.gst.Caps capsOut, @NotNull org.gstreamer.gst.FlowReturn lastFlowReturn) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        java.util.Objects.requireNonNull(bufferIn, "Parameter 'bufferIn' must not be null");
        java.util.Objects.requireNonNull(capsIn, "Parameter 'capsIn' must not be null");
        java.util.Objects.requireNonNull(bufferOut, "Parameter 'bufferOut' must not be null");
        java.util.Objects.requireNonNull(capsOut, "Parameter 'capsOut' must not be null");
        java.util.Objects.requireNonNull(lastFlowReturn, "Parameter 'lastFlowReturn' must not be null");
        try {
            DowncallHandles.gst_check_element_push_buffer_list.invokeExact(
                    Interop.allocateNativeString(elementName),
                    bufferIn.handle(),
                    capsIn.handle(),
                    bufferOut.handle(),
                    capsOut.handle(),
                    lastFlowReturn.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bufferIn.yieldOwnership();
        bufferOut.yieldOwnership();
    }
    
    public static void checkInit(PointerInteger argc, @NotNull PointerString argv) {
        java.util.Objects.requireNonNull(argc, "Parameter 'argc' must not be null");
        java.util.Objects.requireNonNull(argv, "Parameter 'argv' must not be null");
        try {
            DowncallHandles.gst_check_init.invokeExact(
                    argc.handle(),
                    argv.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void checkMessageError(@NotNull org.gstreamer.gst.Message message, @NotNull org.gstreamer.gst.MessageType type, @NotNull org.gtk.glib.Quark domain, int code) {
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        try {
            DowncallHandles.gst_check_message_error.invokeExact(
                    message.handle(),
                    type.getValue(),
                    domain.getValue().intValue(),
                    code);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unrefs {@code object_to_unref} and checks that is has properly been
     * destroyed.
     * @param objectToUnref The {@link org.gtk.gobject.Object} to unref
     */
    public static void checkObjectDestroyedOnUnref(@Nullable java.lang.foreign.MemoryAddress objectToUnref) {
        try {
            DowncallHandles.gst_check_object_destroyed_on_unref.invokeExact(
                    (Addressable) (objectToUnref == null ? MemoryAddress.NULL : (Addressable) objectToUnref));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unrefs {@code object_to_unref} and checks that is has properly been
     * destroyed, also checks that the other objects passed in
     * parameter have been destroyed as a concequence of
     * unrefing {@code object_to_unref}. Last variable argument should be NULL.
     * @param objectToUnref The {@link org.gtk.gobject.Object} to unref
     * @param firstObject The first object that should be destroyed as a
     * concequence of unrefing {@code object_to_unref}.
     * @param varargs Additional object that should have been destroyed.
     */
    public static void checkObjectsDestroyedOnUnref(@Nullable java.lang.foreign.MemoryAddress objectToUnref, @Nullable java.lang.foreign.MemoryAddress firstObject, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_check_objects_destroyed_on_unref.invokeExact(
                    (Addressable) (objectToUnref == null ? MemoryAddress.NULL : (Addressable) objectToUnref),
                    (Addressable) (firstObject == null ? MemoryAddress.NULL : (Addressable) firstObject),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Remove a filter that has been added by {@code gst_check_add_log_filter}.
     * <p>
     * MT safe.
     * @param filter Filter returned by {@code gst_check_add_log_filter}
     */
    public static void checkRemoveLogFilter(@NotNull org.gstreamer.check.CheckLogFilter filter) {
        java.util.Objects.requireNonNull(filter, "Parameter 'filter' must not be null");
        try {
            DowncallHandles.gst_check_remove_log_filter.invokeExact(
                    filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static int checkRunSuite(@NotNull java.lang.foreign.MemoryAddress suite, @NotNull java.lang.String name, @NotNull java.lang.String fname) {
        java.util.Objects.requireNonNull(suite, "Parameter 'suite' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(fname, "Parameter 'fname' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_check_run_suite.invokeExact(
                    (Addressable) suite,
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(fname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * setup an element for a filter test with mysrcpad and mysinkpad
     * @param factory factory
     * @return a new element
     */
    public static @NotNull org.gstreamer.gst.Element checkSetupElement(@NotNull java.lang.String factory) {
        java.util.Objects.requireNonNull(factory, "Parameter 'factory' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_check_setup_element.invokeExact(
                    Interop.allocateNativeString(factory));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.FULL);
    }
    
    /**
     * Push stream-start, caps and segment event, which consist of the minimum
     * required events to allow streaming. Caps is optional to allow raw src
     * testing. If {@code element} has more than one src or sink pad, use
     * gst_check_setup_events_with_stream_id() instead.
     * @param srcpad The src {@link org.gstreamer.gst.Pad} to push on
     * @param element The {@link org.gstreamer.gst.Element} use to create the stream id
     * @param caps {@link org.gstreamer.gst.Caps} in case caps event must be sent
     * @param format The {@link org.gstreamer.gst.Format} of the default segment to send
     */
    public static void checkSetupEvents(@NotNull org.gstreamer.gst.Pad srcpad, @NotNull org.gstreamer.gst.Element element, @Nullable org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.gst.Format format) {
        java.util.Objects.requireNonNull(srcpad, "Parameter 'srcpad' must not be null");
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.gst_check_setup_events.invokeExact(
                    srcpad.handle(),
                    element.handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()),
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Push stream-start, caps and segment event, which consist of the minimum
     * required events to allow streaming. Caps is optional to allow raw src
     * testing.
     * @param srcpad The src {@link org.gstreamer.gst.Pad} to push on
     * @param element The {@link org.gstreamer.gst.Element} use to create the stream id
     * @param caps {@link org.gstreamer.gst.Caps} in case caps event must be sent
     * @param format The {@link org.gstreamer.gst.Format} of the default segment to send
     * @param streamId A unique identifier for the stream
     */
    public static void checkSetupEventsWithStreamId(@NotNull org.gstreamer.gst.Pad srcpad, @NotNull org.gstreamer.gst.Element element, @Nullable org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.gst.Format format, @NotNull java.lang.String streamId) {
        java.util.Objects.requireNonNull(srcpad, "Parameter 'srcpad' must not be null");
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(streamId, "Parameter 'streamId' must not be null");
        try {
            DowncallHandles.gst_check_setup_events_with_stream_id.invokeExact(
                    srcpad.handle(),
                    element.handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()),
                    format.getValue(),
                    Interop.allocateNativeString(streamId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Does the same as {@code gst_check_setup_sink_pad_by_name} with the &lt;emphasis&gt; name &lt;/emphasis&gt; parameter equal to "src".
     * @param element element to setup pad on
     * @param tmpl pad template
     * @return a new pad that can be used to check the output of {@code element}
     */
    public static @NotNull org.gstreamer.gst.Pad checkSetupSinkPad(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.StaticPadTemplate tmpl) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(tmpl, "Parameter 'tmpl' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_check_setup_sink_pad.invokeExact(
                    element.handle(),
                    tmpl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new sink pad (based on the given {@code tmpl}) and links it to the given {@code element} src pad
     * (the pad that matches the given {@code name}).
     * You can set event/chain/query functions on this pad to check the output of the {@code element}.
     * @param element element to setup pad on
     * @param tmpl pad template
     * @param name Name of the {@code element} src pad that will be linked to the sink pad that will be setup
     * @return a new pad that can be used to check the output of {@code element}
     */
    public static @NotNull org.gstreamer.gst.Pad checkSetupSinkPadByName(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.StaticPadTemplate tmpl, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(tmpl, "Parameter 'tmpl' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_check_setup_sink_pad_by_name.invokeExact(
                    element.handle(),
                    tmpl.handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.gst.Pad checkSetupSinkPadByNameFromTemplate(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.PadTemplate tmpl, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(tmpl, "Parameter 'tmpl' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_check_setup_sink_pad_by_name_from_template.invokeExact(
                    element.handle(),
                    tmpl.handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.gst.Pad checkSetupSinkPadFromTemplate(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.PadTemplate tmpl) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(tmpl, "Parameter 'tmpl' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_check_setup_sink_pad_from_template.invokeExact(
                    element.handle(),
                    tmpl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
    }
    
    /**
     * Does the same as {@code gst_check_setup_src_pad_by_name} with the &lt;emphasis&gt; name &lt;/emphasis&gt; parameter equal to "sink".
     * @param element element to setup pad on
     * @param tmpl pad template
     * @return A new pad that can be used to inject data on {@code element}
     */
    public static @NotNull org.gstreamer.gst.Pad checkSetupSrcPad(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.StaticPadTemplate tmpl) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(tmpl, "Parameter 'tmpl' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_check_setup_src_pad.invokeExact(
                    element.handle(),
                    tmpl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new src pad (based on the given {@code tmpl}) and links it to the given {@code element} sink pad (the pad that matches the given {@code name}).
     * Before using the src pad to push data on {@code element} you need to call {@code gst_check_setup_events} on the created src pad.
     * <p>
     * Example of how to push a buffer on {@code element}:
     * <pre>{@code <!-- language="C" -->
     * static GstStaticPadTemplate sinktemplate = GST_STATIC_PAD_TEMPLATE ("sink",
     * GST_PAD_SINK,
     * GST_PAD_ALWAYS,
     * GST_STATIC_CAPS (YOUR_CAPS_TEMPLATE_STRING)
     * );
     * static GstStaticPadTemplate srctemplate = GST_STATIC_PAD_TEMPLATE ("src",
     * GST_PAD_SRC,
     * GST_PAD_ALWAYS,
     * GST_STATIC_CAPS (YOUR_CAPS_TEMPLATE_STRING)
     * );
     * 
     * GstElement * element = gst_check_setup_element ("element");
     * GstPad * mysrcpad = gst_check_setup_src_pad (element, &srctemplate);
     * GstPad * mysinkpad = gst_check_setup_sink_pad (element, &sinktemplate);
     * 
     * gst_pad_set_active (mysrcpad, TRUE);
     * gst_pad_set_active (mysinkpad, TRUE);
     * fail_unless (gst_element_set_state (element, GST_STATE_PLAYING) == GST_STATE_CHANGE_SUCCESS, "could not set to playing");
     * 
     * GstCaps * caps = gst_caps_from_string (YOUR_DESIRED_SINK_CAPS);
     * gst_check_setup_events (mysrcpad, element, caps, GST_FORMAT_TIME);
     * gst_caps_unref (caps);
     * 
     * fail_unless (gst_pad_push (mysrcpad, gst_buffer_new_and_alloc(2)) == GST_FLOW_OK);
     * }</pre>
     * <p>
     * For very simple input/output test scenarios checkout {@code gst_check_element_push_buffer_list} and {@code gst_check_element_push_buffer}.
     * @param element element to setup src pad on
     * @param tmpl pad template
     * @param name Name of the {@code element} sink pad that will be linked to the src pad that will be setup
     * @return A new pad that can be used to inject data on {@code element}
     */
    public static @NotNull org.gstreamer.gst.Pad checkSetupSrcPadByName(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.StaticPadTemplate tmpl, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(tmpl, "Parameter 'tmpl' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_check_setup_src_pad_by_name.invokeExact(
                    element.handle(),
                    tmpl.handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.gst.Pad checkSetupSrcPadByNameFromTemplate(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.PadTemplate tmpl, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(tmpl, "Parameter 'tmpl' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_check_setup_src_pad_by_name_from_template.invokeExact(
                    element.handle(),
                    tmpl.handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.gst.Pad checkSetupSrcPadFromTemplate(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.PadTemplate tmpl) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(tmpl, "Parameter 'tmpl' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_check_setup_src_pad_from_template.invokeExact(
                    element.handle(),
                    tmpl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
    }
    
    public static void checkTeardownElement(@NotNull org.gstreamer.gst.Element element) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        try {
            DowncallHandles.gst_check_teardown_element.invokeExact(
                    element.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void checkTeardownPadByName(@NotNull org.gstreamer.gst.Element element, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_check_teardown_pad_by_name.invokeExact(
                    element.handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void checkTeardownSinkPad(@NotNull org.gstreamer.gst.Element element) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        try {
            DowncallHandles.gst_check_teardown_sink_pad.invokeExact(
                    element.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void checkTeardownSrcPad(@NotNull org.gstreamer.gst.Element element) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        try {
            DowncallHandles.gst_check_teardown_src_pad.invokeExact(
                    element.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets up a data probe on the given pad which will raise assertions if the
     * data flow is inconsistent.
     * @param consist The {@link StreamConsistency} handle
     * @param pad The {@link org.gstreamer.gst.Pad} on which the dataflow will be checked.
     * @return {@code true} if the pad was added
     */
    public static boolean consistencyCheckerAddPad(@NotNull org.gstreamer.check.StreamConsistency consist, @NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(consist, "Parameter 'consist' must not be null");
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_consistency_checker_add_pad.invokeExact(
                    consist.handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Frees the allocated data and probes associated with {@code consist}.
     * @param consist The {@link StreamConsistency} to free.
     */
    public static void consistencyCheckerFree(@NotNull org.gstreamer.check.StreamConsistency consist) {
        java.util.Objects.requireNonNull(consist, "Parameter 'consist' must not be null");
        try {
            DowncallHandles.gst_consistency_checker_free.invokeExact(
                    consist.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets up a data probe on the given pad which will raise assertions if the
     * data flow is inconsistent.
     * @param pad The {@link org.gstreamer.gst.Pad} on which the dataflow will be checked.
     * @return A {@link StreamConsistency} structure used to track data flow.
     */
    public static @NotNull org.gstreamer.check.StreamConsistency consistencyCheckerNew(@NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_consistency_checker_new.invokeExact(
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.StreamConsistency(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Reset the stream checker's internal variables.
     * @param consist The {@link StreamConsistency} to reset.
     */
    public static void consistencyCheckerReset(@NotNull org.gstreamer.check.StreamConsistency consist) {
        java.util.Objects.requireNonNull(consist, "Parameter 'consist' must not be null");
        try {
            DowncallHandles.gst_consistency_checker_reset.invokeExact(
                    consist.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new harness. Works like gst_harness_new_with_padnames(), except it
     * assumes the {@link org.gstreamer.gst.Element} sinkpad is named "sink" and srcpad is named "src"
     * <p>
     * MT safe.
     * @param elementName a {@code gchar} describing the {@link org.gstreamer.gst.Element} name
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness harnessNew(@NotNull java.lang.String elementName) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new.invokeExact(
                    Interop.allocateNativeString(elementName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new empty harness. Use gst_harness_add_element_full() to add
     * an {@link org.gstreamer.gst.Element} to it.
     * <p>
     * MT safe.
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness harnessNewEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new harness.
     * <p>
     * MT safe.
     * @param element a {@link org.gstreamer.gst.Element} to attach the harness to (transfer none)
     * @param hsrc a {@link org.gstreamer.gst.StaticPadTemplate} describing the harness srcpad.
     * {@code null} will not create a harness srcpad.
     * @param elementSinkpadName a {@code gchar} with the name of the element
     * sinkpad that is then linked to the harness srcpad. Can be a static or request
     * or a sometimes pad that has been added. {@code null} will not get/request a sinkpad
     * from the element. (Like if the element is a src.)
     * @param hsink a {@link org.gstreamer.gst.StaticPadTemplate} describing the harness sinkpad.
     * {@code null} will not create a harness sinkpad.
     * @param elementSrcpadName a {@code gchar} with the name of the element
     * srcpad that is then linked to the harness sinkpad, similar to the
     * {@code element_sinkpad_name}.
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness harnessNewFull(@NotNull org.gstreamer.gst.Element element, @Nullable org.gstreamer.gst.StaticPadTemplate hsrc, @Nullable java.lang.String elementSinkpadName, @Nullable org.gstreamer.gst.StaticPadTemplate hsink, @Nullable java.lang.String elementSrcpadName) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_full.invokeExact(
                    element.handle(),
                    (Addressable) (hsrc == null ? MemoryAddress.NULL : hsrc.handle()),
                    (Addressable) (elementSinkpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSinkpadName)),
                    (Addressable) (hsink == null ? MemoryAddress.NULL : hsink.handle()),
                    (Addressable) (elementSrcpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSrcpadName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new harness, parsing the {@code launchline} and putting that in a {@link org.gstreamer.gst.Bin},
     * and then attches the harness to the bin.
     * <p>
     * MT safe.
     * @param launchline a {@code gchar} describing a gst-launch type line
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness harnessNewParse(@NotNull java.lang.String launchline) {
        java.util.Objects.requireNonNull(launchline, "Parameter 'launchline' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_parse.invokeExact(
                    Interop.allocateNativeString(launchline));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new harness. Works in the same way as gst_harness_new_full(), only
     * that generic padtemplates are used for the harness src and sinkpads, which
     * will be sufficient in most usecases.
     * <p>
     * MT safe.
     * @param element a {@link org.gstreamer.gst.Element} to attach the harness to (transfer none)
     * @param elementSinkpadName a {@code gchar} with the name of the element
     * sinkpad that is then linked to the harness srcpad. {@code null} does not attach a
     * sinkpad
     * @param elementSrcpadName a {@code gchar} with the name of the element
     * srcpad that is then linked to the harness sinkpad. {@code null} does not attach a
     * srcpad
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness harnessNewWithElement(@NotNull org.gstreamer.gst.Element element, @Nullable java.lang.String elementSinkpadName, @Nullable java.lang.String elementSrcpadName) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_with_element.invokeExact(
                    element.handle(),
                    (Addressable) (elementSinkpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSinkpadName)),
                    (Addressable) (elementSrcpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSrcpadName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new harness. Works like gst_harness_new_with_element(),
     * except you specify the factoryname of the {@link org.gstreamer.gst.Element}
     * <p>
     * MT safe.
     * @param elementName a {@code gchar} describing the {@link org.gstreamer.gst.Element} name
     * @param elementSinkpadName a {@code gchar} with the name of the element
     * sinkpad that is then linked to the harness srcpad. {@code null} does not attach a
     * sinkpad
     * @param elementSrcpadName a {@code gchar} with the name of the element
     * srcpad that is then linked to the harness sinkpad. {@code null} does not attach a
     * srcpad
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness harnessNewWithPadnames(@NotNull java.lang.String elementName, @Nullable java.lang.String elementSinkpadName, @Nullable java.lang.String elementSrcpadName) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_with_padnames.invokeExact(
                    Interop.allocateNativeString(elementName),
                    (Addressable) (elementSinkpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSinkpadName)),
                    (Addressable) (elementSrcpadName == null ? MemoryAddress.NULL : Interop.allocateNativeString(elementSrcpadName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new harness, like gst_harness_new_full(), except it
     * assumes the {@link org.gstreamer.gst.Element} sinkpad is named "sink" and srcpad is named "src"
     * <p>
     * MT safe.
     * @param elementName a {@code gchar} describing the {@link org.gstreamer.gst.Element} name
     * @param hsrc a {@link org.gstreamer.gst.StaticPadTemplate} describing the harness srcpad.
     * {@code null} will not create a harness srcpad.
     * @param hsink a {@link org.gstreamer.gst.StaticPadTemplate} describing the harness sinkpad.
     * {@code null} will not create a harness sinkpad.
     * @return a {@link Harness}, or {@code null} if the harness could
     * not be created
     */
    public static @NotNull org.gstreamer.check.Harness harnessNewWithTemplates(@NotNull java.lang.String elementName, @Nullable org.gstreamer.gst.StaticPadTemplate hsrc, @Nullable org.gstreamer.gst.StaticPadTemplate hsink) {
        java.util.Objects.requireNonNull(elementName, "Parameter 'elementName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_harness_new_with_templates.invokeExact(
                    Interop.allocateNativeString(elementName),
                    (Addressable) (hsrc == null ? MemoryAddress.NULL : hsrc.handle()),
                    (Addressable) (hsink == null ? MemoryAddress.NULL : hsink.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.check.Harness(RESULT, Ownership.FULL);
    }
    
    /**
     * Stop the running {@link HarnessThread}
     * <p>
     * MT safe.
     * @param t a {@link HarnessThread}
     */
    public static int harnessStressThreadStop(@NotNull org.gstreamer.check.HarnessThread t) {
        java.util.Objects.requireNonNull(t, "Parameter 't' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_harness_stress_thread_stop.invokeExact(
                    t.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_buffer_straw_get_buffer = Interop.downcallHandle(
            "gst_buffer_straw_get_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_straw_start_pipeline = Interop.downcallHandle(
            "gst_buffer_straw_start_pipeline",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_straw_stop_pipeline = Interop.downcallHandle(
            "gst_buffer_straw_stop_pipeline",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_abi_list = Interop.downcallHandle(
            "gst_check_abi_list",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_check_add_log_filter = Interop.downcallHandle(
            "gst_check_add_log_filter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_buffer_data = Interop.downcallHandle(
            "gst_check_buffer_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_check_caps_equal = Interop.downcallHandle(
            "gst_check_caps_equal",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_chain_func = Interop.downcallHandle(
            "gst_check_chain_func",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_clear_log_filter = Interop.downcallHandle(
            "gst_check_clear_log_filter",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_check_drop_buffers = Interop.downcallHandle(
            "gst_check_drop_buffers",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_check_element_push_buffer = Interop.downcallHandle(
            "gst_check_element_push_buffer",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_element_push_buffer_list = Interop.downcallHandle(
            "gst_check_element_push_buffer_list",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_check_init = Interop.downcallHandle(
            "gst_check_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_message_error = Interop.downcallHandle(
            "gst_check_message_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_check_object_destroyed_on_unref = Interop.downcallHandle(
            "gst_check_object_destroyed_on_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_objects_destroyed_on_unref = Interop.downcallHandle(
            "gst_check_objects_destroyed_on_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_check_remove_log_filter = Interop.downcallHandle(
            "gst_check_remove_log_filter",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_run_suite = Interop.downcallHandle(
            "gst_check_run_suite",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_setup_element = Interop.downcallHandle(
            "gst_check_setup_element",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_setup_events = Interop.downcallHandle(
            "gst_check_setup_events",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_check_setup_events_with_stream_id = Interop.downcallHandle(
            "gst_check_setup_events_with_stream_id",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_setup_sink_pad = Interop.downcallHandle(
            "gst_check_setup_sink_pad",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_setup_sink_pad_by_name = Interop.downcallHandle(
            "gst_check_setup_sink_pad_by_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_setup_sink_pad_by_name_from_template = Interop.downcallHandle(
            "gst_check_setup_sink_pad_by_name_from_template",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_setup_sink_pad_from_template = Interop.downcallHandle(
            "gst_check_setup_sink_pad_from_template",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_setup_src_pad = Interop.downcallHandle(
            "gst_check_setup_src_pad",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_setup_src_pad_by_name = Interop.downcallHandle(
            "gst_check_setup_src_pad_by_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_setup_src_pad_by_name_from_template = Interop.downcallHandle(
            "gst_check_setup_src_pad_by_name_from_template",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_setup_src_pad_from_template = Interop.downcallHandle(
            "gst_check_setup_src_pad_from_template",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_teardown_element = Interop.downcallHandle(
            "gst_check_teardown_element",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_teardown_pad_by_name = Interop.downcallHandle(
            "gst_check_teardown_pad_by_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_teardown_sink_pad = Interop.downcallHandle(
            "gst_check_teardown_sink_pad",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_check_teardown_src_pad = Interop.downcallHandle(
            "gst_check_teardown_src_pad",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_consistency_checker_add_pad = Interop.downcallHandle(
            "gst_consistency_checker_add_pad",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_consistency_checker_free = Interop.downcallHandle(
            "gst_consistency_checker_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_consistency_checker_new = Interop.downcallHandle(
            "gst_consistency_checker_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_consistency_checker_reset = Interop.downcallHandle(
            "gst_consistency_checker_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new = Interop.downcallHandle(
            "gst_harness_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_empty = Interop.downcallHandle(
            "gst_harness_new_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_full = Interop.downcallHandle(
            "gst_harness_new_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_parse = Interop.downcallHandle(
            "gst_harness_new_parse",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_with_element = Interop.downcallHandle(
            "gst_harness_new_with_element",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_with_padnames = Interop.downcallHandle(
            "gst_harness_new_with_padnames",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_new_with_templates = Interop.downcallHandle(
            "gst_harness_new_with_templates",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_harness_stress_thread_stop = Interop.downcallHandle(
            "gst_harness_stress_thread_stop",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
        
        public static Addressable cbHarnessPrepareEventFunc(MemoryAddress h, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (HarnessPrepareEventFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onHarnessPrepareEventFunc(new org.gstreamer.check.Harness(h, Ownership.NONE));
            return RESULT.handle();
        }
        
        public static int cbCheckLogFilterFunc(MemoryAddress logDomain, int logLevel, MemoryAddress message, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CheckLogFilterFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onCheckLogFilterFunc(Interop.getStringFrom(logDomain), new org.gtk.glib.LogLevelFlags(logLevel), Interop.getStringFrom(message));
            return RESULT ? 1 : 0;
        }
        
        public static Addressable cbHarnessPrepareBufferFunc(MemoryAddress h, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (HarnessPrepareBufferFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onHarnessPrepareBufferFunc(new org.gstreamer.check.Harness(h, Ownership.NONE));
            return RESULT.handle();
        }
    }
}

package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Mpeg2Dpb extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpeg2Dpb";
    
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
     * Allocate a new {@link Mpeg2Dpb}
     * @return A new, uninitialized @{link Mpeg2Dpb}
     */
    public static Mpeg2Dpb allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Mpeg2Dpb newInstance = new Mpeg2Dpb(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Mpeg2Dpb proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Mpeg2Dpb(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Mpeg2Dpb> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Mpeg2Dpb(input, ownership);
    
    /**
     * Store the {@code picture}
     * @param picture a {@link Mpeg2Picture}
     */
    public void add(org.gstreamer.codecs.Mpeg2Picture picture) {
        try {
            DowncallHandles.gst_mpeg2_dpb_add.invokeExact(
                    handle(),
                    picture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        picture.yieldOwnership();
    }
    
    public @Nullable org.gstreamer.codecs.Mpeg2Picture bump() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpeg2_dpb_bump.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.codecs.Mpeg2Picture.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Clear all stored {@link Mpeg2Picture}
     */
    public void clear() {
        try {
            DowncallHandles.gst_mpeg2_dpb_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free the {@code dpb}
     */
    public void free() {
        try {
            DowncallHandles.gst_mpeg2_dpb_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the neighbours {@link Mpeg2Picture} of {@code picture} in {@code dpb}.
     * @param picture current {@link Mpeg2Picture}
     * @param prevPicturePtr previuous
     *     {@link Mpeg2Picture} in {@code dpb}
     * @param nextPicturePtr next
     *     {@link Mpeg2Picture} in {@code dpb}
     */
    public void getNeighbours(org.gstreamer.codecs.Mpeg2Picture picture, @Nullable Out<org.gstreamer.codecs.Mpeg2Picture> prevPicturePtr, @Nullable Out<org.gstreamer.codecs.Mpeg2Picture> nextPicturePtr) {
        MemorySegment prevPicturePtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment nextPicturePtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_mpeg2_dpb_get_neighbours.invokeExact(
                    handle(),
                    picture.handle(),
                    (Addressable) (prevPicturePtr == null ? MemoryAddress.NULL : (Addressable) prevPicturePtrPOINTER.address()),
                    (Addressable) (nextPicturePtr == null ? MemoryAddress.NULL : (Addressable) nextPicturePtrPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (prevPicturePtr != null) prevPicturePtr.set(org.gstreamer.codecs.Mpeg2Picture.fromAddress.marshal(prevPicturePtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        if (nextPicturePtr != null) nextPicturePtr.set(org.gstreamer.codecs.Mpeg2Picture.fromAddress.marshal(nextPicturePtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Checks if {@code dbp} has a new picture.
     * @return {@code TRUE} if {@code dpb} needs to be bumped; otherwise, {@code FALSE}
     */
    public boolean needBump() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpeg2_dpb_need_bump.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Create new {@link Mpeg2Dpb}
     * @return a new {@link Mpeg2Dpb}
     */
    public static org.gstreamer.codecs.Mpeg2Dpb new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpeg2_dpb_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.codecs.Mpeg2Dpb.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpeg2_dpb_add = Interop.downcallHandle(
            "gst_mpeg2_dpb_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpeg2_dpb_bump = Interop.downcallHandle(
            "gst_mpeg2_dpb_bump",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpeg2_dpb_clear = Interop.downcallHandle(
            "gst_mpeg2_dpb_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpeg2_dpb_free = Interop.downcallHandle(
            "gst_mpeg2_dpb_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpeg2_dpb_get_neighbours = Interop.downcallHandle(
            "gst_mpeg2_dpb_get_neighbours",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpeg2_dpb_need_bump = Interop.downcallHandle(
            "gst_mpeg2_dpb_need_bump",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpeg2_dpb_new = Interop.downcallHandle(
            "gst_mpeg2_dpb_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}

package org.gstreamer.allocators;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstAllocators namespace.
 */
public final class GstAllocators {
    
    static {
        LibLoad.loadLibrary("gstallocators-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
public static final java.lang.String ALLOCATOR_DMABUF = "dmabuf";
    
public static final java.lang.String ALLOCATOR_FD = "fd";
    
/**
 * Constant that defines the caps feature name for DMA buffer sharing.
 * <p>
 * It has to be used for non-mappable dma-buf only, i.e. when the underlying
 * memory is not mappable to user space. Or when the mapped memory contains
 * non meaningful data. It can be the case for protected content or when the
 * user wants explicitly avoid any software post processing.
 * <p>
 * In these cases all elements between the exported and the importer has to work
 * in passthrough mode. This is done by adding this caps feature.
 * <p>
 * When the memory is mappable for read and write requests then it is assumes
 * to be a fast path and so this caps feature should not be used. Though
 * according to the dma-buf protocol, while it is mapped it prevents the
 * exporter to migrate the buffer.
 * <p>
 * This caps feature should not serve at all the purpose of selecting the
 * {@code GST_ALLOCATOR_DMABUF} allocator during caps negotiation.
 * When the exporter is the upstream element from the importer point of view,
 * the exporter should try to map the dma buffer at runtime (preferably during
 * decide_allocation phase). When it succeeds for {@code GST_MAP_READWRITE} this caps
 * feature should not be used. This allows scalers, color converts and any image
 * processing filters to work directly on the dma buffer.
 * In this case the importer element should check all incoming memory using
 * gst_is_dmabuf_memory().
 */
public static final java.lang.String CAPS_FEATURE_MEMORY_DMABUF = "memory:DMABuf";

/**
 * Return the file descriptor associated with {@code mem}.
 * @param mem the memory to get the file descriptor
 * @return the file descriptor associated with the memory, or -1.  The file
 *     descriptor is still owned by the GstMemory.  Use dup to take a copy
 *     if you intend to use it beyond the lifetime of this GstMemory.
 */
public static int dmabufMemoryGetFd(org.gstreamer.gst.Memory mem) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_dmabuf_memory_get_fd.invokeExact(mem.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Get the fd from {@code mem}. Call gst_is_fd_memory() to check if {@code mem} has
 * an fd.
 * @param mem {@link org.gstreamer.gst.Memory}
 * @return the fd of {@code mem} or -1 when there is no fd on {@code mem}
 */
public static int fdMemoryGetFd(org.gstreamer.gst.Memory mem) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_fd_memory_get_fd.invokeExact(mem.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Check if {@code mem} is dmabuf memory.
 * @param mem the memory to be check
 * @return {@code true} if {@code mem} is dmabuf memory, otherwise {@code false}
 */
public static boolean isDmabufMemory(org.gstreamer.gst.Memory mem) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_is_dmabuf_memory.invokeExact(mem.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Check if {@code mem} is memory backed by an fd
 * @param mem {@link org.gstreamer.gst.Memory}
 * @return {@code true} when {@code mem} has an fd that can be retrieved with
 * gst_fd_memory_get_fd().
 */
public static boolean isFdMemory(org.gstreamer.gst.Memory mem) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_is_fd_memory.invokeExact(mem.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static boolean isPhysMemory(org.gstreamer.gst.Memory mem) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_is_phys_memory.invokeExact(mem.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

public static long physMemoryGetPhysAddr(org.gstreamer.gst.Memory mem) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_phys_memory_get_phys_addr.invokeExact(mem.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}
    
    private static class DowncallHandles {

private static final MethodHandle gst_dmabuf_memory_get_fd = Interop.downcallHandle(
        "gst_dmabuf_memory_get_fd",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_fd_memory_get_fd = Interop.downcallHandle(
        "gst_fd_memory_get_fd",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_is_dmabuf_memory = Interop.downcallHandle(
        "gst_is_dmabuf_memory",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_is_fd_memory = Interop.downcallHandle(
        "gst_is_fd_memory",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_is_phys_memory = Interop.downcallHandle(
        "gst_is_phys_memory",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_phys_memory_get_phys_addr = Interop.downcallHandle(
        "gst_phys_memory_get_phys_addr",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);
    }
    
    private static void registerTypes() {
        if (DmaBufAllocator.isAvailable()) Interop.register(DmaBufAllocator.getType(), DmaBufAllocator.fromAddress);
        if (FdAllocator.isAvailable()) Interop.register(FdAllocator.getType(), FdAllocator.fromAddress);
        if (PhysMemoryAllocator.isAvailable()) Interop.register(PhysMemoryAllocator.getType(), PhysMemoryAllocator.fromAddress);
    }
}

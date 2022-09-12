package io.github.jwharm.javagi;

import jdk.incubator.foreign.*;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;

import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public class Interop {

    private static boolean initialized = false;
    private static ResourceScope scope;
    private static SegmentAllocator allocator;
    public static final HashMap<Integer, Object> signalRegistry = new HashMap<>();
    private static NativeSymbol cbDestroyNotify_nativeSymbol;

    private static void initialize() {
        scope = ResourceScope.newConfinedScope();
        allocator = SegmentAllocator.nativeAllocator(scope);
        initialized = true;

        // Initialize upcall stub for DestroyNotify callback
        try {
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(Interop.class, "cbDestroyNotify", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
            cbDestroyNotify_nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, scope);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ResourceScope getScope() {
        if (!initialized) {
            initialize();
        }
        return scope;
    }

    public static SegmentAllocator getAllocator() {
        if (!initialized) {
            initialize();
        }
        return allocator;
    }

    public static int registerCallback(int hash, Object callback) {
        signalRegistry.put(hash, callback);
        return hash;
    }

    public static void cbDestroyNotify(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        signalRegistry.remove(hash);
    }

    public static NativeSymbol cbDestroyNotifySymbol() {
        if (!initialized) {
            initialize();
        }
        return cbDestroyNotify_nativeSymbol;
    }

    public static MemorySegmentReference allocateNativeString(String string) {
        if (!initialized) {
            initialize();
        }
        return new MemorySegmentReference(allocator.allocateUtf8String(string));
    }

    /**
     * Allocates and initializes a NULL-terminated array of strings (NUL-terminated utf8 char*).
     */
    public static MemorySegmentReference allocateNativeArray(String[] strings) {
        if (!initialized) {
            initialize();
        }
        var memorySegment = allocator.allocateArray(ValueLayout.ADDRESS, strings.length + 1);
        for (int i = 0; i < strings.length; i++) {
            var cString = allocator.allocateUtf8String(strings[i]);
            memorySegment.setAtIndex(ValueLayout.ADDRESS, i, cString);
        }
        memorySegment.setAtIndex(ValueLayout.ADDRESS, strings.length, MemoryAddress.NULL);
        return new MemorySegmentReference(memorySegment);
    }

    public static MemorySegmentReference allocateNativeArray(boolean[] array) {
        if (!initialized) {
            initialize();
        }
        if (array == null || array.length == 0) {
            return null;
        }
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = array[i] ? 1 : 0;
        }
        return new MemorySegmentReference(
                allocator.allocateArray(ValueLayout.JAVA_INT, intArray)
        );
    }

    public static MemorySegmentReference allocateNativeArray(org.gtk.gobject.Type[] array) {
        if (!initialized) {
            initialize();
        }
        if (array == null || array.length == 0) {
            return null;
        }
        long[] longArray = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            longArray[i] = array[i].getValue();
        }
        return new MemorySegmentReference(
                allocator.allocateArray(ValueLayout.JAVA_LONG, longArray)
        );
    }

    public static MemorySegmentReference allocateNativeArray(org.gtk.gobject.Value[] array) {
        if (!initialized) {
            initialize();
        }
        if (array == null || array.length == 0) {
            return null;
        }
        MemorySegment mem = io.github.jwharm.javagi.interop.jextract.GValue.allocateArray(array.length, allocator);
        long size = io.github.jwharm.javagi.interop.jextract.GValue.sizeof();
        for (int i = 0; i < array.length; i++) {
            MemorySegment source = MemorySegment.ofAddress(array[i].handle(), size, scope);
            MemorySegment target = mem.asSlice(i * size, size);
            target.copyFrom(source);
        }
        return new MemorySegmentReference(mem);
    }

    /**
     * Allocates and initializes a NULL-terminated array of pointers (from NativeAddress instances).
     */
    public static MemorySegmentReference allocateNativeArray(NativeAddress[] array) {
        if (!initialized) {
            initialize();
        }
        var memorySegment = allocator.allocateArray(ValueLayout.ADDRESS, array.length + 1);
        for (int i = 0; i < array.length; i++) {
            memorySegment.setAtIndex(ValueLayout.ADDRESS, i, array[i].handle());
        }
        memorySegment.setAtIndex(ValueLayout.ADDRESS, array.length, MemoryAddress.NULL);
        return new MemorySegmentReference(memorySegment);
    }

    /**
     * Allocates and initializes a NULL-terminated array of pointers (MemoryAddress instances).
     */
    public static MemorySegmentReference allocateNativeArray(MemoryAddress[] array) {
        if (!initialized) {
            initialize();
        }
        var memorySegment = allocator.allocateArray(ValueLayout.ADDRESS, array.length + 1);
        for (int i = 0; i < array.length; i++) {
            memorySegment.setAtIndex(ValueLayout.ADDRESS, i, array[i]);
        }
        memorySegment.setAtIndex(ValueLayout.ADDRESS, array.length, MemoryAddress.NULL);
        return new MemorySegmentReference(memorySegment);
    }
}
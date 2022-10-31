package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoGlyphVisAttr} structure communicates information between
 * the shaping and rendering phases.
 * <p>
 * Currently, it contains cluster start and color information.
 * More attributes may be added in the future.
 * <p>
 * Clusters are stored in visual order, within the cluster, glyphs
 * are always ordered in logical order, since visual order is meaningless;
 * that is, in Arabic text, accent glyphs follow the glyphs for the
 * base character.
 */
public class GlyphVisAttr extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoGlyphVisAttr";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("is_cluster_start"),
        ValueLayout.JAVA_INT.withName("is_color")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static GlyphVisAttr allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GlyphVisAttr newInstance = new GlyphVisAttr(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code is_cluster_start}
     * @return The value of the field {@code is_cluster_start}
     */
    public int is_cluster_start$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_cluster_start"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_cluster_start}
     * @param is_cluster_start The new value of the field {@code is_cluster_start}
     */
    public void is_cluster_start$set(int is_cluster_start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_cluster_start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_cluster_start);
    }
    
    /**
     * Get the value of the field {@code is_color}
     * @return The value of the field {@code is_color}
     */
    public int is_color$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_color"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_color}
     * @param is_color The new value of the field {@code is_color}
     */
    public void is_color$set(int is_color) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_color"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_color);
    }
    
    @ApiStatus.Internal
    public GlyphVisAttr(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}

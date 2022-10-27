package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specify the order of the rotations on each axis.
 * <p>
 * The {@link EulerOrder#DEFAULT} value is special, and is used
 * as an alias for one of the other orders.
 * @version 1.2
 */
public class EulerOrder extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Rotate in the default order; the
     *   default order is one of the following enumeration values
     */
    public static final EulerOrder DEFAULT = new EulerOrder(-1);
    
    /**
     * Rotate in the X, Y, and Z order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SXYZ}
     */
    public static final EulerOrder XYZ = new EulerOrder(0);
    
    /**
     * Rotate in the Y, Z, and X order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SYZX}
     */
    public static final EulerOrder YZX = new EulerOrder(1);
    
    /**
     * Rotate in the Z, X, and Y order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SZXY}
     */
    public static final EulerOrder ZXY = new EulerOrder(2);
    
    /**
     * Rotate in the X, Z, and Y order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SXZY}
     */
    public static final EulerOrder XZY = new EulerOrder(3);
    
    /**
     * Rotate in the Y, X, and Z order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SYXZ}
     */
    public static final EulerOrder YXZ = new EulerOrder(4);
    
    /**
     * Rotate in the Z, Y, and X order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SZYX}
     */
    public static final EulerOrder ZYX = new EulerOrder(5);
    
    /**
     * Defines a static rotation along the X, Y, and Z axes (Since: 1.10)
     */
    public static final EulerOrder SXYZ = new EulerOrder(6);
    
    /**
     * Defines a static rotation along the X, Y, and X axes (Since: 1.10)
     */
    public static final EulerOrder SXYX = new EulerOrder(7);
    
    /**
     * Defines a static rotation along the X, Z, and Y axes (Since: 1.10)
     */
    public static final EulerOrder SXZY = new EulerOrder(8);
    
    /**
     * Defines a static rotation along the X, Z, and X axes (Since: 1.10)
     */
    public static final EulerOrder SXZX = new EulerOrder(9);
    
    /**
     * Defines a static rotation along the Y, Z, and X axes (Since: 1.10)
     */
    public static final EulerOrder SYZX = new EulerOrder(10);
    
    /**
     * Defines a static rotation along the Y, Z, and Y axes (Since: 1.10)
     */
    public static final EulerOrder SYZY = new EulerOrder(11);
    
    /**
     * Defines a static rotation along the Y, X, and Z axes (Since: 1.10)
     */
    public static final EulerOrder SYXZ = new EulerOrder(12);
    
    /**
     * Defines a static rotation along the Y, X, and Y axes (Since: 1.10)
     */
    public static final EulerOrder SYXY = new EulerOrder(13);
    
    /**
     * Defines a static rotation along the Z, X, and Y axes (Since: 1.10)
     */
    public static final EulerOrder SZXY = new EulerOrder(14);
    
    /**
     * Defines a static rotation along the Z, X, and Z axes (Since: 1.10)
     */
    public static final EulerOrder SZXZ = new EulerOrder(15);
    
    /**
     * Defines a static rotation along the Z, Y, and X axes (Since: 1.10)
     */
    public static final EulerOrder SZYX = new EulerOrder(16);
    
    /**
     * Defines a static rotation along the Z, Y, and Z axes (Since: 1.10)
     */
    public static final EulerOrder SZYZ = new EulerOrder(17);
    
    /**
     * Defines a relative rotation along the Z, Y, and X axes (Since: 1.10)
     */
    public static final EulerOrder RZYX = new EulerOrder(18);
    
    /**
     * Defines a relative rotation along the X, Y, and X axes (Since: 1.10)
     */
    public static final EulerOrder RXYX = new EulerOrder(19);
    
    /**
     * Defines a relative rotation along the Y, Z, and X axes (Since: 1.10)
     */
    public static final EulerOrder RYZX = new EulerOrder(20);
    
    /**
     * Defines a relative rotation along the X, Z, and X axes (Since: 1.10)
     */
    public static final EulerOrder RXZX = new EulerOrder(21);
    
    /**
     * Defines a relative rotation along the X, Z, and Y axes (Since: 1.10)
     */
    public static final EulerOrder RXZY = new EulerOrder(22);
    
    /**
     * Defines a relative rotation along the Y, Z, and Y axes (Since: 1.10)
     */
    public static final EulerOrder RYZY = new EulerOrder(23);
    
    /**
     * Defines a relative rotation along the Z, X, and Y axes (Since: 1.10)
     */
    public static final EulerOrder RZXY = new EulerOrder(24);
    
    /**
     * Defines a relative rotation along the Y, X, and Y axes (Since: 1.10)
     */
    public static final EulerOrder RYXY = new EulerOrder(25);
    
    /**
     * Defines a relative rotation along the Y, X, and Z axes (Since: 1.10)
     */
    public static final EulerOrder RYXZ = new EulerOrder(26);
    
    /**
     * Defines a relative rotation along the Z, X, and Z axes (Since: 1.10)
     */
    public static final EulerOrder RZXZ = new EulerOrder(27);
    
    /**
     * Defines a relative rotation along the X, Y, and Z axes (Since: 1.10)
     */
    public static final EulerOrder RXYZ = new EulerOrder(28);
    
    /**
     * Defines a relative rotation along the Z, Y, and Z axes (Since: 1.10)
     */
    public static final EulerOrder RZYZ = new EulerOrder(29);
    
    public EulerOrder(int value) {
        super(value);
    }
}

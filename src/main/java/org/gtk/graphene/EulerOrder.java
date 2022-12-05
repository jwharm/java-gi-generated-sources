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
public enum EulerOrder implements io.github.jwharm.javagi.Enumeration {
    /**
     * Rotate in the default order; the
     *   default order is one of the following enumeration values
     */
    DEFAULT(-1),
    /**
     * Rotate in the X, Y, and Z order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SXYZ}
     */
    XYZ(0),
    /**
     * Rotate in the Y, Z, and X order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SYZX}
     */
    YZX(1),
    /**
     * Rotate in the Z, X, and Y order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SZXY}
     */
    ZXY(2),
    /**
     * Rotate in the X, Z, and Y order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SXZY}
     */
    XZY(3),
    /**
     * Rotate in the Y, X, and Z order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SYXZ}
     */
    YXZ(4),
    /**
     * Rotate in the Z, Y, and X order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SZYX}
     */
    ZYX(5),
    /**
     * Defines a static rotation along the X, Y, and Z axes (Since: 1.10)
     */
    SXYZ(6),
    /**
     * Defines a static rotation along the X, Y, and X axes (Since: 1.10)
     */
    SXYX(7),
    /**
     * Defines a static rotation along the X, Z, and Y axes (Since: 1.10)
     */
    SXZY(8),
    /**
     * Defines a static rotation along the X, Z, and X axes (Since: 1.10)
     */
    SXZX(9),
    /**
     * Defines a static rotation along the Y, Z, and X axes (Since: 1.10)
     */
    SYZX(10),
    /**
     * Defines a static rotation along the Y, Z, and Y axes (Since: 1.10)
     */
    SYZY(11),
    /**
     * Defines a static rotation along the Y, X, and Z axes (Since: 1.10)
     */
    SYXZ(12),
    /**
     * Defines a static rotation along the Y, X, and Y axes (Since: 1.10)
     */
    SYXY(13),
    /**
     * Defines a static rotation along the Z, X, and Y axes (Since: 1.10)
     */
    SZXY(14),
    /**
     * Defines a static rotation along the Z, X, and Z axes (Since: 1.10)
     */
    SZXZ(15),
    /**
     * Defines a static rotation along the Z, Y, and X axes (Since: 1.10)
     */
    SZYX(16),
    /**
     * Defines a static rotation along the Z, Y, and Z axes (Since: 1.10)
     */
    SZYZ(17),
    /**
     * Defines a relative rotation along the Z, Y, and X axes (Since: 1.10)
     */
    RZYX(18),
    /**
     * Defines a relative rotation along the X, Y, and X axes (Since: 1.10)
     */
    RXYX(19),
    /**
     * Defines a relative rotation along the Y, Z, and X axes (Since: 1.10)
     */
    RYZX(20),
    /**
     * Defines a relative rotation along the X, Z, and X axes (Since: 1.10)
     */
    RXZX(21),
    /**
     * Defines a relative rotation along the X, Z, and Y axes (Since: 1.10)
     */
    RXZY(22),
    /**
     * Defines a relative rotation along the Y, Z, and Y axes (Since: 1.10)
     */
    RYZY(23),
    /**
     * Defines a relative rotation along the Z, X, and Y axes (Since: 1.10)
     */
    RZXY(24),
    /**
     * Defines a relative rotation along the Y, X, and Y axes (Since: 1.10)
     */
    RYXY(25),
    /**
     * Defines a relative rotation along the Y, X, and Z axes (Since: 1.10)
     */
    RYXZ(26),
    /**
     * Defines a relative rotation along the Z, X, and Z axes (Since: 1.10)
     */
    RZXZ(27),
    /**
     * Defines a relative rotation along the X, Y, and Z axes (Since: 1.10)
     */
    RXYZ(28),
    /**
     * Defines a relative rotation along the Z, Y, and Z axes (Since: 1.10)
     */
    RZYZ(29);
    
    private static final java.lang.String C_TYPE_NAME = "graphene_euler_order_t";
    
    private final int value;
    EulerOrder(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static EulerOrder of(int value) {
        return switch (value) {
            case -1 -> DEFAULT;
            case 0 -> XYZ;
            case 1 -> YZX;
            case 2 -> ZXY;
            case 3 -> XZY;
            case 4 -> YXZ;
            case 5 -> ZYX;
            case 6 -> SXYZ;
            case 7 -> SXYX;
            case 8 -> SXZY;
            case 9 -> SXZX;
            case 10 -> SYZX;
            case 11 -> SYZY;
            case 12 -> SYXZ;
            case 13 -> SYXY;
            case 14 -> SZXY;
            case 15 -> SZXZ;
            case 16 -> SZYX;
            case 17 -> SZYZ;
            case 18 -> RZYX;
            case 19 -> RXYX;
            case 20 -> RYZX;
            case 21 -> RXZX;
            case 22 -> RXZY;
            case 23 -> RYZY;
            case 24 -> RZXY;
            case 25 -> RYXY;
            case 26 -> RYXZ;
            case 27 -> RZXZ;
            case 28 -> RXYZ;
            case 29 -> RZYZ;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}

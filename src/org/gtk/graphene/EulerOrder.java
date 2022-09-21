package org.gtk.graphene;

/**
 * Specify the order of the rotations on each axis.
 * <p>
 * The {@link EulerOrder#DEFAULT} value is special, and is used
 * as an alias for one of the other orders.
 */
public enum EulerOrder {

    /**
     * Rotate in the default order; the
     *   default order is one of the following enumeration values
     */
    DEFAULT,
    
    /**
     * Rotate in the X, Y, and Z order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SXYZ}
     */
    XYZ,
    
    /**
     * Rotate in the Y, Z, and X order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SYZX}
     */
    YZX,
    
    /**
     * Rotate in the Z, X, and Y order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SZXY}
     */
    ZXY,
    
    /**
     * Rotate in the X, Z, and Y order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SXZY}
     */
    XZY,
    
    /**
     * Rotate in the Y, X, and Z order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SYXZ}
     */
    YXZ,
    
    /**
     * Rotate in the Z, Y, and X order. Deprecated in
     *   Graphene 1.10, it's an alias for {@link EulerOrder#SZYX}
     */
    ZYX,
    
    /**
     * Defines a static rotation along the X, Y, and Z axes (Since: 1.10)
     */
    SXYZ,
    
    /**
     * Defines a static rotation along the X, Y, and X axes (Since: 1.10)
     */
    SXYX,
    
    /**
     * Defines a static rotation along the X, Z, and Y axes (Since: 1.10)
     */
    SXZY,
    
    /**
     * Defines a static rotation along the X, Z, and X axes (Since: 1.10)
     */
    SXZX,
    
    /**
     * Defines a static rotation along the Y, Z, and X axes (Since: 1.10)
     */
    SYZX,
    
    /**
     * Defines a static rotation along the Y, Z, and Y axes (Since: 1.10)
     */
    SYZY,
    
    /**
     * Defines a static rotation along the Y, X, and Z axes (Since: 1.10)
     */
    SYXZ,
    
    /**
     * Defines a static rotation along the Y, X, and Y axes (Since: 1.10)
     */
    SYXY,
    
    /**
     * Defines a static rotation along the Z, X, and Y axes (Since: 1.10)
     */
    SZXY,
    
    /**
     * Defines a static rotation along the Z, X, and Z axes (Since: 1.10)
     */
    SZXZ,
    
    /**
     * Defines a static rotation along the Z, Y, and X axes (Since: 1.10)
     */
    SZYX,
    
    /**
     * Defines a static rotation along the Z, Y, and Z axes (Since: 1.10)
     */
    SZYZ,
    
    /**
     * Defines a relative rotation along the Z, Y, and X axes (Since: 1.10)
     */
    RZYX,
    
    /**
     * Defines a relative rotation along the X, Y, and X axes (Since: 1.10)
     */
    RXYX,
    
    /**
     * Defines a relative rotation along the Y, Z, and X axes (Since: 1.10)
     */
    RYZX,
    
    /**
     * Defines a relative rotation along the X, Z, and X axes (Since: 1.10)
     */
    RXZX,
    
    /**
     * Defines a relative rotation along the X, Z, and Y axes (Since: 1.10)
     */
    RXZY,
    
    /**
     * Defines a relative rotation along the Y, Z, and Y axes (Since: 1.10)
     */
    RYZY,
    
    /**
     * Defines a relative rotation along the Z, X, and Y axes (Since: 1.10)
     */
    RZXY,
    
    /**
     * Defines a relative rotation along the Y, X, and Y axes (Since: 1.10)
     */
    RYXY,
    
    /**
     * Defines a relative rotation along the Y, X, and Z axes (Since: 1.10)
     */
    RYXZ,
    
    /**
     * Defines a relative rotation along the Z, X, and Z axes (Since: 1.10)
     */
    RZXZ,
    
    /**
     * Defines a relative rotation along the X, Y, and Z axes (Since: 1.10)
     */
    RXYZ,
    
    /**
     * Defines a relative rotation along the Z, Y, and Z axes (Since: 1.10)
     */
    RZYZ;
    
    public static EulerOrder fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DEFAULT -> -1;
            case XYZ -> 0;
            case YZX -> 1;
            case ZXY -> 2;
            case XZY -> 3;
            case YXZ -> 4;
            case ZYX -> 5;
            case SXYZ -> 6;
            case SXYX -> 7;
            case SXZY -> 8;
            case SXZX -> 9;
            case SYZX -> 10;
            case SYZY -> 11;
            case SYXZ -> 12;
            case SYXY -> 13;
            case SZXY -> 14;
            case SZXZ -> 15;
            case SZYX -> 16;
            case SZYZ -> 17;
            case RZYX -> 18;
            case RXYX -> 19;
            case RYZX -> 20;
            case RXZX -> 21;
            case RXZY -> 22;
            case RYZY -> 23;
            case RZXY -> 24;
            case RYXY -> 25;
            case RYXZ -> 26;
            case RZXZ -> 27;
            case RXYZ -> 28;
            case RZYZ -> 29;
        };
    }

}

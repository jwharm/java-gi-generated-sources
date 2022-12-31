package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See http://creativecommons.org/ns for more information.
 */
public class TagLicenseFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstTagLicenseFlags";
    
    /**
     * making multiple copies
     *     is allowed
     */
    public static final TagLicenseFlags PERMITS_REPRODUCTION = new TagLicenseFlags(1);
    
    /**
     * distribution, public display
     *     and public performance are allowed
     */
    public static final TagLicenseFlags PERMITS_DISTRIBUTION = new TagLicenseFlags(2);
    
    /**
     * distribution of derivative
     *     works is allowed
     */
    public static final TagLicenseFlags PERMITS_DERIVATIVE_WORKS = new TagLicenseFlags(4);
    
    /**
     * commercial derivatives are allowed,
     *     but only non-commercial distribution is allowed
     */
    public static final TagLicenseFlags PERMITS_SHARING = new TagLicenseFlags(8);
    
    /**
     * copyright and license notices
     *     must be kept intact
     */
    public static final TagLicenseFlags REQUIRES_NOTICE = new TagLicenseFlags(256);
    
    /**
     * credit must be given to
     *     copyright holder and/or author
     */
    public static final TagLicenseFlags REQUIRES_ATTRIBUTION = new TagLicenseFlags(512);
    
    /**
     * derivative works must be
     *     licensed under the same terms or compatible terms as the original work
     */
    public static final TagLicenseFlags REQUIRES_SHARE_ALIKE = new TagLicenseFlags(1024);
    
    /**
     * source code (the preferred
     *     form for making modifications) must be provided when exercising some
     *     rights granted by the license
     */
    public static final TagLicenseFlags REQUIRES_SOURCE_CODE = new TagLicenseFlags(2048);
    
    /**
     * derivative and combined works
     *     must be licensed under specified terms, similar to those of the original
     *     work
     */
    public static final TagLicenseFlags REQUIRES_COPYLEFT = new TagLicenseFlags(4096);
    
    /**
     * derivative works must be
     *     licensed under specified terms, with at least the same conditions as
     *     the original work; combinations with the work may be licensed under
     *     different terms
     */
    public static final TagLicenseFlags REQUIRES_LESSER_COPYLEFT = new TagLicenseFlags(8192);
    
    /**
     * exercising rights for
     *     commercial purposes is prohibited
     */
    public static final TagLicenseFlags PROHIBITS_COMMERCIAL_USE = new TagLicenseFlags(65536);
    
    /**
     * use in a
     *     non-developing country is prohibited
     */
    public static final TagLicenseFlags PROHIBITS_HIGH_INCOME_NATION_USE = new TagLicenseFlags(131072);
    
    /**
     * this license was created
     *     by the Creative Commons project
     */
    public static final TagLicenseFlags CREATIVE_COMMONS_LICENSE = new TagLicenseFlags(16777216);
    
    /**
     * this license was
     *     created by the Free Software Foundation (FSF)
     */
    public static final TagLicenseFlags FREE_SOFTWARE_FOUNDATION_LICENSE = new TagLicenseFlags(33554432);
    
    public TagLicenseFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TagLicenseFlags or(TagLicenseFlags... masks) {
        int value = this.getValue();
        for (TagLicenseFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TagLicenseFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TagLicenseFlags combined(TagLicenseFlags mask, TagLicenseFlags... masks) {
        int value = mask.getValue();
        for (TagLicenseFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TagLicenseFlags(value);
    }
}

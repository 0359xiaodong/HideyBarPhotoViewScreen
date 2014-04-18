package com.hideybarphotoviewscreen.photoloader;

/**
 *
 */

import com.hideybarphotoviewscreen.utils.PictureUtils;

/**
 * Photo loader that uses Picasso from (Square).
 */
public class PicassoPhotoLoader extends PhotoLoader {
    private int placeHolderResId = PictureUtils.unusedPictureResID(), errorDrawableResId = PictureUtils.unusedPictureResID();
    private boolean willShowProgressView;

    public PicassoPhotoLoader() {
        super(TYPE_PICASSO_LOADER);
    }

    /**
     * This base setup will show a progress view while the photo is being loaded.
     * If you want to set a placeholder or an error drawable, apply them after calling this method.
     *
     * @return the same loader with the new setup.
     */
    public PicassoPhotoLoader baseSetup() {
        this.willShowProgressView = true;
        return this;
    }

    /**
     * Sets the resource id of the drawable we want to display while the photo is being loaded.
     * If you want to set a placeholder or an error drawable, apply them after calling this method.
     *
     * @return the same loader with the new setup.
     */
    public PicassoPhotoLoader setPlaceHolderResId(final int placeHolderResId) {
        this.placeHolderResId = placeHolderResId;
        return this;
    }

    /**
     * Sets the resource id of the drawable we want to display if there is an error while trying to load the photo.
     *
     * @return the same loader with the new setup.
     */
    public PicassoPhotoLoader setErrorDrawableResId(final int errorDrawableResId) {
        this.errorDrawableResId = errorDrawableResId;
        return this;
    }

    /**
     * Call this method if you want to show a progress view while the photo is being loaded.
     *
     * @return the same loader with the new setup.
     */
    public PicassoPhotoLoader showProgressView(final boolean willShowProgressView) {
        this.willShowProgressView = willShowProgressView;
        return this;
    }

    public boolean needsToDisplayProgressView(){
        return willShowProgressView;
    }

    public int getPlaceHolderResId() {
        return placeHolderResId;
    }

    public int getErrorDrawableResId() {
        return errorDrawableResId;
    }
}

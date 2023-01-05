/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class VideoWindowInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VideoWindowInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VideoWindowInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_VideoWindowInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIsNative(boolean value) {
    pjsua2JNI.VideoWindowInfo_isNative_set(swigCPtr, this, value);
  }

  public boolean getIsNative() {
    return pjsua2JNI.VideoWindowInfo_isNative_get(swigCPtr, this);
  }

  public void setWinHandle(VideoWindowHandle value) {
    pjsua2JNI.VideoWindowInfo_winHandle_set(swigCPtr, this, VideoWindowHandle.getCPtr(value), value);
  }

  public VideoWindowHandle getWinHandle() {
    long cPtr = pjsua2JNI.VideoWindowInfo_winHandle_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VideoWindowHandle(cPtr, false);
  }

  public void setRenderDeviceId(int value) {
    pjsua2JNI.VideoWindowInfo_renderDeviceId_set(swigCPtr, this, value);
  }

  public int getRenderDeviceId() {
    return pjsua2JNI.VideoWindowInfo_renderDeviceId_get(swigCPtr, this);
  }

  public void setShow(boolean value) {
    pjsua2JNI.VideoWindowInfo_show_set(swigCPtr, this, value);
  }

  public boolean getShow() {
    return pjsua2JNI.VideoWindowInfo_show_get(swigCPtr, this);
  }

  public void setPos(MediaCoordinate value) {
    pjsua2JNI.VideoWindowInfo_pos_set(swigCPtr, this, MediaCoordinate.getCPtr(value), value);
  }

  public MediaCoordinate getPos() {
    long cPtr = pjsua2JNI.VideoWindowInfo_pos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MediaCoordinate(cPtr, false);
  }

  public void setSize(MediaSize value) {
    pjsua2JNI.VideoWindowInfo_size_set(swigCPtr, this, MediaSize.getCPtr(value), value);
  }

  public MediaSize getSize() {
    long cPtr = pjsua2JNI.VideoWindowInfo_size_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MediaSize(cPtr, false);
  }

  public VideoWindowInfo() {
    this(pjsua2JNI.new_VideoWindowInfo(), true);
  }

}

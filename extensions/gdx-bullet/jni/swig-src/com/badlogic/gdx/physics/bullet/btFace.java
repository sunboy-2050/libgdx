/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btFace {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public btFace(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btFace obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btFace(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public void setM_indices(SWIGTYPE_p_btAlignedObjectArrayT_int_t value) {
    gdxBulletJNI.btFace_m_indices_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_int_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_int_t getM_indices() {
    long cPtr = gdxBulletJNI.btFace_m_indices_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_int_t(cPtr, false);
  }

  public void setM_plane(float[] value) {
    gdxBulletJNI.btFace_m_plane_set(swigCPtr, this, value);
  }

  public float[] getM_plane() {
    return gdxBulletJNI.btFace_m_plane_get(swigCPtr, this);
  }

  public btFace() {
    this(gdxBulletJNI.new_btFace(), true);
  }

}

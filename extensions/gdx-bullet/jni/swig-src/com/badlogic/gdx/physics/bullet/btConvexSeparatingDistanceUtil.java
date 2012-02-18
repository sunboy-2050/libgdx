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

public class btConvexSeparatingDistanceUtil {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public btConvexSeparatingDistanceUtil(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConvexSeparatingDistanceUtil obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConvexSeparatingDistanceUtil(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public btConvexSeparatingDistanceUtil(float boundingRadiusA, float boundingRadiusB) {
    this(gdxBulletJNI.new_btConvexSeparatingDistanceUtil(boundingRadiusA, boundingRadiusB), true);
  }

  public float getConservativeSeparatingDistance() {
    return gdxBulletJNI.btConvexSeparatingDistanceUtil_getConservativeSeparatingDistance(swigCPtr, this);
  }

  public void updateSeparatingDistance(btTransform transA, btTransform transB) {
    gdxBulletJNI.btConvexSeparatingDistanceUtil_updateSeparatingDistance(swigCPtr, this, btTransform.getCPtr(transA), transA, btTransform.getCPtr(transB), transB);
  }

  public void initSeparatingDistance(Vector3 separatingVector, float separatingDistance, btTransform transA, btTransform transB) {
    gdxBulletJNI.btConvexSeparatingDistanceUtil_initSeparatingDistance(swigCPtr, this, separatingVector, separatingDistance, btTransform.getCPtr(transA), transA, btTransform.getCPtr(transB), transB);
  }

}

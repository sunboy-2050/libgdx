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

public class SphereTriangleDetector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SphereTriangleDetector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SphereTriangleDetector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_SphereTriangleDetector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public void getClosestPoints(ClosestPointInput input, Result output, btIDebugDraw debugDraw, boolean swapResults) {
    gdxBulletJNI.SphereTriangleDetector_getClosestPoints__SWIG_0(swigCPtr, this, ClosestPointInput.getCPtr(input), input, Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw, swapResults);
  }

  public void getClosestPoints(ClosestPointInput input, Result output, btIDebugDraw debugDraw) {
    gdxBulletJNI.SphereTriangleDetector_getClosestPoints__SWIG_1(swigCPtr, this, ClosestPointInput.getCPtr(input), input, Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw);
  }

  public SphereTriangleDetector(btSphereShape sphere, btTriangleShape triangle, float contactBreakingThreshold) {
    this(gdxBulletJNI.new_SphereTriangleDetector(btSphereShape.getCPtr(sphere), sphere, btTriangleShape.getCPtr(triangle), triangle, contactBreakingThreshold), true);
  }

  public boolean collide(Vector3 sphereCenter, Vector3 point, Vector3 resultNormal, SWIGTYPE_p_float depth, SWIGTYPE_p_float timeOfImpact, float contactBreakingThreshold) {
    return gdxBulletJNI.SphereTriangleDetector_collide(swigCPtr, this, sphereCenter, point, resultNormal, SWIGTYPE_p_float.getCPtr(depth), SWIGTYPE_p_float.getCPtr(timeOfImpact), contactBreakingThreshold);
  }

}

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

public class btSolve2LinearConstraint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public btSolve2LinearConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSolve2LinearConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSolve2LinearConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public btSolve2LinearConstraint(float tau, float damping) {
    this(gdxBulletJNI.new_btSolve2LinearConstraint(tau, damping), true);
  }

  public void resolveUnilateralPairConstraint(btRigidBody body0, btRigidBody body1, Matrix3 world2A, Matrix3 world2B, Vector3 invInertiaADiag, float invMassA, Vector3 linvelA, Vector3 angvelA, Vector3 rel_posA1, Vector3 invInertiaBDiag, float invMassB, Vector3 linvelB, Vector3 angvelB, Vector3 rel_posA2, float depthA, Vector3 normalA, Vector3 rel_posB1, Vector3 rel_posB2, float depthB, Vector3 normalB, SWIGTYPE_p_float imp0, SWIGTYPE_p_float imp1) {
    gdxBulletJNI.btSolve2LinearConstraint_resolveUnilateralPairConstraint(swigCPtr, this, btRigidBody.getCPtr(body0), body0, btRigidBody.getCPtr(body1), body1, world2A, world2B, invInertiaADiag, invMassA, linvelA, angvelA, rel_posA1, invInertiaBDiag, invMassB, linvelB, angvelB, rel_posA2, depthA, normalA, rel_posB1, rel_posB2, depthB, normalB, SWIGTYPE_p_float.getCPtr(imp0), SWIGTYPE_p_float.getCPtr(imp1));
  }

  public void resolveBilateralPairConstraint(btRigidBody body0, btRigidBody body1, Matrix3 world2A, Matrix3 world2B, Vector3 invInertiaADiag, float invMassA, Vector3 linvelA, Vector3 angvelA, Vector3 rel_posA1, Vector3 invInertiaBDiag, float invMassB, Vector3 linvelB, Vector3 angvelB, Vector3 rel_posA2, float depthA, Vector3 normalA, Vector3 rel_posB1, Vector3 rel_posB2, float depthB, Vector3 normalB, SWIGTYPE_p_float imp0, SWIGTYPE_p_float imp1) {
    gdxBulletJNI.btSolve2LinearConstraint_resolveBilateralPairConstraint(swigCPtr, this, btRigidBody.getCPtr(body0), body0, btRigidBody.getCPtr(body1), body1, world2A, world2B, invInertiaADiag, invMassA, linvelA, angvelA, rel_posA1, invInertiaBDiag, invMassB, linvelB, angvelB, rel_posA2, depthA, normalA, rel_posB1, rel_posB2, depthB, normalB, SWIGTYPE_p_float.getCPtr(imp0), SWIGTYPE_p_float.getCPtr(imp1));
  }

}

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/stewart/iWork/WebRTC/webrtcjingleproject/trunk/android/voice-client-example/target/unpack/apklibs/com.tuenti.voice_voice-aidl_apklib_1.0-SNAPSHOT/src/com/tuenti/voice/core/service/IConnectionService.aidl
 */
package com.tuenti.voice.core.service;
public interface IConnectionService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.tuenti.voice.core.service.IConnectionService
{
private static final java.lang.String DESCRIPTOR = "com.tuenti.voice.core.service.IConnectionService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.tuenti.voice.core.service.IConnectionService interface,
 * generating a proxy if needed.
 */
public static com.tuenti.voice.core.service.IConnectionService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.tuenti.voice.core.service.IConnectionService))) {
return ((com.tuenti.voice.core.service.IConnectionService)iin);
}
return new com.tuenti.voice.core.service.IConnectionService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_login:
{
data.enforceInterface(DESCRIPTOR);
com.tuenti.voice.core.data.Connection _arg0;
if ((0!=data.readInt())) {
_arg0 = com.tuenti.voice.core.data.Connection.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.login(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_logout:
{
data.enforceInterface(DESCRIPTOR);
this.logout();
reply.writeNoException();
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
com.tuenti.voice.core.service.IConnectionServiceCallback _arg0;
_arg0 = com.tuenti.voice.core.service.IConnectionServiceCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
com.tuenti.voice.core.service.IConnectionServiceCallback _arg0;
_arg0 = com.tuenti.voice.core.service.IConnectionServiceCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterCallback(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.tuenti.voice.core.service.IConnectionService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void login(com.tuenti.voice.core.data.Connection connection) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((connection!=null)) {
_data.writeInt(1);
connection.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_login, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void logout() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_logout, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerCallback(com.tuenti.voice.core.service.IConnectionServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterCallback(com.tuenti.voice.core.service.IConnectionServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_login = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_logout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void login(com.tuenti.voice.core.data.Connection connection) throws android.os.RemoteException;
public void logout() throws android.os.RemoteException;
public void registerCallback(com.tuenti.voice.core.service.IConnectionServiceCallback cb) throws android.os.RemoteException;
public void unregisterCallback(com.tuenti.voice.core.service.IConnectionServiceCallback cb) throws android.os.RemoteException;
}

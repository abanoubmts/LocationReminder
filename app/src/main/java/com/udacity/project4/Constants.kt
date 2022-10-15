package com.udacity.project4

import com.google.android.gms.location.Geofence

object Constants {

        // authentication
        const val TAG_AUTH = "AuthenticationActivity"
        const val SIGN_IN_RESULT_CODE = 1001
        // Geofence broadcast Receiver
        const val ACTION_GEOFENCE_EVENT = "SaveReminder.reminder.action.ACTION_GEOFENCE_EVENT"

        //Geofence Transaction Job

        const val JOB_ID = 573
        const val TAG = "GeofenceIntentSer"


        //  used in getUserLocation() at selected location class

        const val DEFAULT_ZOOM_LEVEL = 15f

        // used in  requestLocationPermission
        const val PERMISSION_CODE_LOCATION_REQUEST = 1
}

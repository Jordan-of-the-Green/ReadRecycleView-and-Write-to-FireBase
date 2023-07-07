package com.administrator.firebase_write

import com.google.firebase.database.IgnoreExtraProperties

// [START rtdb_user_class]
@IgnoreExtraProperties
data class User(val name: String? = null,
                val category: String? = null,
                val date: String? = null,
                val startTimes: String? = null,
                val endTimes: String? = null,
                val description: String? = null)
{

}
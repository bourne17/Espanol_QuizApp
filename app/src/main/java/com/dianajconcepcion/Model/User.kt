package com.dianajconcepcion.Model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "tbl_user")
data class User (
    @PrimaryKey val id:Int,
    @ColumnInfo(name="firstName")  val firstName:String,
    @ColumnInfo(name="lastName") val lastName:String,
    @ColumnInfo(name="email") val email:String,
    @ColumnInfo(name="password") val password:String

):Parcelable
/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models.room

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import org.openapitools.client.models.*


@Entity(tableName = "User")
/**
* Room model for A User who is purchasing from the pet store
* @param id 
* @param username 
* @param firstName 
* @param lastName 
* @param email 
* @param password 
* @param phone 
* @param userStatus User Status
*/
data class UserRoomModel (
    @PrimaryKey(autoGenerate = true) var roomTableId: Int,
    
    var id: kotlin.Long? = null,
    var username: kotlin.String? = null,
    var firstName: kotlin.String? = null,
    var lastName: kotlin.String? = null,
    var email: kotlin.String? = null,
    var password: kotlin.String? = null,
    var phone: kotlin.String? = null,
    var userStatus: kotlin.Int? = null,
    
    ) {

    companion object { }

        fun toApiModel(): User = User(
        id = this.id,
        username = this.username,
        firstName = this.firstName,
        lastName = this.lastName,
        email = this.email,
        password = this.password,
        phone = this.phone,
        userStatus = this.userStatus,
        )
}
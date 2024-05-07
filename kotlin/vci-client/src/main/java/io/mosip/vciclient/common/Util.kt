package io.mosip.vciclient.common

import java.nio.charset.StandardCharsets
import java.util.Date

class  Util {
   companion object {
       fun getLogTag(className:String): String {
            return "INJI-VCI-Client : $className"
       }
       fun toByteArray(content: String): ByteArray {
           return content.toByteArray(StandardCharsets.UTF_8)
       }
   }
}
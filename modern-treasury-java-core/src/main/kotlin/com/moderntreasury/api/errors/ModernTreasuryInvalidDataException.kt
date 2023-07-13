package com.moderntreasury.api.errors

class ModernTreasuryInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    ModernTreasuryException(message, cause)

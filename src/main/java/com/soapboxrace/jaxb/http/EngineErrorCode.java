//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.14 at 11:58:37 AM EDT 
//


package com.soapboxrace.jaxb.http;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EngineErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EngineErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="MissingMethodInputData"/>
 *     &lt;enumeration value="ValuesAreNotEqual"/>
 *     &lt;enumeration value="ArgumentNullOrEmpty"/>
 *     &lt;enumeration value="XmlDeserializationError"/>
 *     &lt;enumeration value="UnknownRemoteAccountManagementError"/>
 *     &lt;enumeration value="ValuesAreEqual"/>
 *     &lt;enumeration value="InvalidOperation"/>
 *     &lt;enumeration value="LeftIsGreaterThanRight"/>
 *     &lt;enumeration value="LeftIsLessThanRight"/>
 *     &lt;enumeration value="ChatConnectionError"/>
 *     &lt;enumeration value="GameServerRegionDoesntExist"/>
 *     &lt;enumeration value="ServerConfigDoesntExist"/>
 *     &lt;enumeration value="CustomCarDoesntExist"/>
 *     &lt;enumeration value="CarNotOwnedByDriver"/>
 *     &lt;enumeration value="CarIsntPresetCar"/>
 *     &lt;enumeration value="CarIsntCustomCar"/>
 *     &lt;enumeration value="CarDataInvalid"/>
 *     &lt;enumeration value="PowerUpItemInfoDoesntExist"/>
 *     &lt;enumeration value="MultiplePaintsInSameSlot"/>
 *     &lt;enumeration value="InvalidPaintGroupForPaintSlot"/>
 *     &lt;enumeration value="CantDeleteLastOwnedCar"/>
 *     &lt;enumeration value="PresetCarDoesntExist"/>
 *     &lt;enumeration value="InvalidCurrencyType"/>
 *     &lt;enumeration value="WalletDoesntExist"/>
 *     &lt;enumeration value="InsufficientFunds"/>
 *     &lt;enumeration value="WalletAlreadyExists"/>
 *     &lt;enumeration value="UnsupportedCurrency"/>
 *     &lt;enumeration value="InvalidDebitAmount"/>
 *     &lt;enumeration value="InvalidCreditAmount"/>
 *     &lt;enumeration value="InvalidWalletType"/>
 *     &lt;enumeration value="WalletNotUserWallet"/>
 *     &lt;enumeration value="InventoryItemDoesntExist"/>
 *     &lt;enumeration value="VirtualItemTypeDoesntExist"/>
 *     &lt;enumeration value="InsufficientInventory"/>
 *     &lt;enumeration value="ItemIsForAnotherTier"/>
 *     &lt;enumeration value="RecursiveCatalog"/>
 *     &lt;enumeration value="InvalidCatalog"/>
 *     &lt;enumeration value="InvalidBasket"/>
 *     &lt;enumeration value="GameIsPrivate"/>
 *     &lt;enumeration value="GameLocked"/>
 *     &lt;enumeration value="NotInGame"/>
 *     &lt;enumeration value="NotEnoughSpace"/>
 *     &lt;enumeration value="GameDoesNotExist"/>
 *     &lt;enumeration value="NotPrivateGame"/>
 *     &lt;enumeration value="InviteAutoDeclined"/>
 *     &lt;enumeration value="MaxStackOrRentalLimitErrorCode"/>
 *     &lt;enumeration value="UnspecifiedError"/>
 *     &lt;enumeration value="RequiredHeadersNotFound"/>
 *     &lt;enumeration value="InvalidHeaderValues"/>
 *     &lt;enumeration value="FailedSessionSecurityPolicy"/>
 *     &lt;enumeration value="FailedUserIdComparison"/>
 *     &lt;enumeration value="FailedPersonaIdComparison"/>
 *     &lt;enumeration value="FailedSessionInsertion"/>
 *     &lt;enumeration value="FailedPresenceCheck"/>
 *     &lt;enumeration value="FailedDeleteSession"/>
 *     &lt;enumeration value="FailedUpdateSession"/>
 *     &lt;enumeration value="FailedReadSession"/>
 *     &lt;enumeration value="NoSuchSessionInSessionStore"/>
 *     &lt;enumeration value="InvalidUserId"/>
 *     &lt;enumeration value="InvalidPresence"/>
 *     &lt;enumeration value="NoSuchInfoValueInSessionCurrentTable"/>
 *     &lt;enumeration value="FailedPlayGameEntitlementCheck"/>
 *     &lt;enumeration value="NotPermanentSessionKey"/>
 *     &lt;enumeration value="WebTokenCheckFailed"/>
 *     &lt;enumeration value="ConfigFilesAuthenticationException"/>
 *     &lt;enumeration value="LoginFailureLimitReached"/>
 *     &lt;enumeration value="MaximumUsersLoggedInHardCapReached"/>
 *     &lt;enumeration value="MaximumUsersLoggedInSoftCapReached"/>
 *     &lt;enumeration value="MaximumUsersLoggedInUnspecified"/>
 *     &lt;enumeration value="SessionRequestThresholdReached"/>
 *     &lt;enumeration value="InvalidEntrantEventSession"/>
 *     &lt;enumeration value="InvalidFinishReason"/>
 *     &lt;enumeration value="InvalidRaceTimeInResult"/>
 *     &lt;enumeration value="InvalidSpeedInResult"/>
 *     &lt;enumeration value="InvalidPlacingInResult"/>
 *     &lt;enumeration value="InvalidFractionCompletedInResult"/>
 *     &lt;enumeration value="InvalidRequestorIdHeader"/>
 *     &lt;enumeration value="UsernameIsNotAllowed"/>
 *     &lt;enumeration value="EmailInvalid"/>
 *     &lt;enumeration value="EmailInvalidDomain"/>
 *     &lt;enumeration value="EmailMissing"/>
 *     &lt;enumeration value="EmailDuplicate"/>
 *     &lt;enumeration value="PasswordMissing"/>
 *     &lt;enumeration value="PasswordTooShort"/>
 *     &lt;enumeration value="PasswordTooLong"/>
 *     &lt;enumeration value="PasswordNoSpacesAllowed"/>
 *     &lt;enumeration value="PasswordEmailCombinationDuplicate"/>
 *     &lt;enumeration value="DateOfBirthMissing"/>
 *     &lt;enumeration value="DateOfBirthInvalid"/>
 *     &lt;enumeration value="DateOfBirthTooYoung"/>
 *     &lt;enumeration value="CountryMissing"/>
 *     &lt;enumeration value="CountryInvalid"/>
 *     &lt;enumeration value="CountryBanned"/>
 *     &lt;enumeration value="LanguageMissing"/>
 *     &lt;enumeration value="LanguageInvalid"/>
 *     &lt;enumeration value="TosVersionMissing"/>
 *     &lt;enumeration value="TosVersionTooLong"/>
 *     &lt;enumeration value="StatusMissing"/>
 *     &lt;enumeration value="StatusInvalid"/>
 *     &lt;enumeration value="StatusIllegalValue"/>
 *     &lt;enumeration value="GlobalOptInMissing"/>
 *     &lt;enumeration value="GlobalOptInInvalid"/>
 *     &lt;enumeration value="ThirdPartyOptInMissing"/>
 *     &lt;enumeration value="ThirdPartyOptInInvalid"/>
 *     &lt;enumeration value="LastAuthenticatedOnDateInvalid"/>
 *     &lt;enumeration value="RemoteUserDoesNotExist"/>
 *     &lt;enumeration value="PasswordIncorrect"/>
 *     &lt;enumeration value="RemoteUserIsBanned"/>
 *     &lt;enumeration value="RegistrationSourceTooLong"/>
 *     &lt;enumeration value="RemoteUserIsGameBanned"/>
 *     &lt;enumeration value="RemoteUserIsTempGameBanned"/>
 *     &lt;enumeration value="InvalidGenderErrorCode"/>
 *     &lt;enumeration value="RemoteNamespaceDoesNotExist"/>
 *     &lt;enumeration value="DisplayNameMissing"/>
 *     &lt;enumeration value="DisplayNameDuplicate"/>
 *     &lt;enumeration value="DisplayNameTooLong"/>
 *     &lt;enumeration value="DisplayNameTooShort"/>
 *     &lt;enumeration value="DisplayNameNotAllowed"/>
 *     &lt;enumeration value="DisplayNameSuggestionFailed"/>
 *     &lt;enumeration value="StatusReasonCodeInvalid"/>
 *     &lt;enumeration value="LastAuthenticatedDateInvalid"/>
 *     &lt;enumeration value="MaximumNumberOfPersonasInNamespaceReached"/>
 *     &lt;enumeration value="PersonaNotFound"/>
 *     &lt;enumeration value="RemotePersonaDoesNotBelongToUser"/>
 *     &lt;enumeration value="UserNotFound"/>
 *     &lt;enumeration value="MoreThanOneRemoteUserFound"/>
 *     &lt;enumeration value="UnableToAuthenticateUserByAuthKey"/>
 *     &lt;enumeration value="PersonaCarIsNull"/>
 *     &lt;enumeration value="PersonaMottoIsTooLong"/>
 *     &lt;enumeration value="TooManySuggestionsRequested"/>
 *     &lt;enumeration value="MaximumNumberOfPersonasForUserReached"/>
 *     &lt;enumeration value="WrongClientVersion"/>
 *     &lt;enumeration value="AuthenticationTokenMissing"/>
 *     &lt;enumeration value="TransactionAlreadyActive"/>
 *     &lt;enumeration value="FriendIsSelf"/>
 *     &lt;enumeration value="FriendAlreadyAdded"/>
 *     &lt;enumeration value="FriendDoesNotExist"/>
 *     &lt;enumeration value="FriendsListExceededMaximumCount"/>
 *     &lt;enumeration value="TargetFriendsListExceededMaximumCount"/>
 *     &lt;enumeration value="NullValue"/>
 *     &lt;enumeration value="LuckyDrawNoTableDefinedForRace"/>
 *     &lt;enumeration value="LuckyDrawInvalidDraw"/>
 *     &lt;enumeration value="LuckyDrawNoMoreDraws"/>
 *     &lt;enumeration value="LuckyDrawNoLootTablesNotPopulated"/>
 *     &lt;enumeration value="LuckyDrawCouldNotDrawProduct"/>
 *     &lt;enumeration value="LuckyDrawCannotDeterminePersonaLevel"/>
 *     &lt;enumeration value="LuckyDrawContextNotFoundOrEmpty"/>
 *     &lt;enumeration value="EventNotFound"/>
 *     &lt;enumeration value="SuggestiveSalesInvalidContext"/>
 *     &lt;enumeration value="SuggestiveSalesInvalidConfiguration"/>
 *     &lt;enumeration value="SuggestiveSalesCannotDeterminePersonaLevel"/>
 *     &lt;enumeration value="MissingRequiredEntitlements"/>
 *     &lt;enumeration value="BannedEntitlements"/>
 *     &lt;enumeration value="RemotePersonaIdInvalid"/>
 *     &lt;enumeration value="PlayerNotRanked"/>
 *     &lt;enumeration value="NoWalletErrorCode"/>
 *     &lt;enumeration value="WalletBalanceIsNotEnough"/>
 *     &lt;enumeration value="UserHasNoEntitlements"/>
 *     &lt;enumeration value="NotInQueue"/>
 *     &lt;enumeration value="EntitlementProductIdMissing"/>
 *     &lt;enumeration value="EntitlementProductIdTooShort"/>
 *     &lt;enumeration value="EntitlementProductIdTooLong"/>
 *     &lt;enumeration value="EntitlementTagMissing"/>
 *     &lt;enumeration value="EntitlementTagTooShort"/>
 *     &lt;enumeration value="EntitlementTagTooLong"/>
 *     &lt;enumeration value="EntitlementGrantDateInvalid"/>
 *     &lt;enumeration value="EntitlementTerminationDateInvalid"/>
 *     &lt;enumeration value="EntitlementNoSuchGroup"/>
 *     &lt;enumeration value="EntitlementConcurrencyFailure"/>
 *     &lt;enumeration value="EntitlementInvalidCount"/>
 *     &lt;enumeration value="NoProductErrorCode"/>
 *     &lt;enumeration value="NoPricepointErrorCode"/>
 *     &lt;enumeration value="MoreThanOneRemotePersonaFound"/>
 *     &lt;enumeration value="ServerConfigNotFound"/>
 *     &lt;enumeration value="NoSuchEntitlementExists"/>
 *     &lt;enumeration value="SessionKeyRequiredButNotFound"/>
 *     &lt;enumeration value="InvalidRewardModeForTelemetry"/>
 *     &lt;enumeration value="SocialFriendRequestNotResolvable"/>
 *     &lt;enumeration value="NotFound"/>
 *     &lt;enumeration value="RemoteAccountManagementTimeout"/>
 *     &lt;enumeration value="VoipRemoteCallTimeout"/>
 *     &lt;enumeration value="VoipUnknownError"/>
 *     &lt;enumeration value="LiveUpdateAuthenticationFailed"/>
 *     &lt;enumeration value="LiveUpdateInvalidCatalogVersion"/>
 *     &lt;enumeration value="SecurityKickedArbitration"/>
 *     &lt;enumeration value="SecurityKickedRaceTime"/>
 *     &lt;enumeration value="SecurityKickedRaceTimeRatio"/>
 *     &lt;enumeration value="SecurityKickedStatisticalRaceTime"/>
 *     &lt;enumeration value="SecurityKickedStatisticalTopSpeed"/>
 *     &lt;enumeration value="SecurityKickedInvalidPowerup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EngineErrorCode")
@XmlEnum
public enum EngineErrorCode {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("MissingMethodInputData")
    MISSING_METHOD_INPUT_DATA("MissingMethodInputData"),
    @XmlEnumValue("ValuesAreNotEqual")
    VALUES_ARE_NOT_EQUAL("ValuesAreNotEqual"),
    @XmlEnumValue("ArgumentNullOrEmpty")
    ARGUMENT_NULL_OR_EMPTY("ArgumentNullOrEmpty"),
    @XmlEnumValue("XmlDeserializationError")
    XML_DESERIALIZATION_ERROR("XmlDeserializationError"),
    @XmlEnumValue("UnknownRemoteAccountManagementError")
    UNKNOWN_REMOTE_ACCOUNT_MANAGEMENT_ERROR("UnknownRemoteAccountManagementError"),
    @XmlEnumValue("ValuesAreEqual")
    VALUES_ARE_EQUAL("ValuesAreEqual"),
    @XmlEnumValue("InvalidOperation")
    INVALID_OPERATION("InvalidOperation"),
    @XmlEnumValue("LeftIsGreaterThanRight")
    LEFT_IS_GREATER_THAN_RIGHT("LeftIsGreaterThanRight"),
    @XmlEnumValue("LeftIsLessThanRight")
    LEFT_IS_LESS_THAN_RIGHT("LeftIsLessThanRight"),
    @XmlEnumValue("ChatConnectionError")
    CHAT_CONNECTION_ERROR("ChatConnectionError"),
    @XmlEnumValue("GameServerRegionDoesntExist")
    GAME_SERVER_REGION_DOESNT_EXIST("GameServerRegionDoesntExist"),
    @XmlEnumValue("ServerConfigDoesntExist")
    SERVER_CONFIG_DOESNT_EXIST("ServerConfigDoesntExist"),
    @XmlEnumValue("CustomCarDoesntExist")
    CUSTOM_CAR_DOESNT_EXIST("CustomCarDoesntExist"),
    @XmlEnumValue("CarNotOwnedByDriver")
    CAR_NOT_OWNED_BY_DRIVER("CarNotOwnedByDriver"),
    @XmlEnumValue("CarIsntPresetCar")
    CAR_ISNT_PRESET_CAR("CarIsntPresetCar"),
    @XmlEnumValue("CarIsntCustomCar")
    CAR_ISNT_CUSTOM_CAR("CarIsntCustomCar"),
    @XmlEnumValue("CarDataInvalid")
    CAR_DATA_INVALID("CarDataInvalid"),
    @XmlEnumValue("PowerUpItemInfoDoesntExist")
    POWER_UP_ITEM_INFO_DOESNT_EXIST("PowerUpItemInfoDoesntExist"),
    @XmlEnumValue("MultiplePaintsInSameSlot")
    MULTIPLE_PAINTS_IN_SAME_SLOT("MultiplePaintsInSameSlot"),
    @XmlEnumValue("InvalidPaintGroupForPaintSlot")
    INVALID_PAINT_GROUP_FOR_PAINT_SLOT("InvalidPaintGroupForPaintSlot"),
    @XmlEnumValue("CantDeleteLastOwnedCar")
    CANT_DELETE_LAST_OWNED_CAR("CantDeleteLastOwnedCar"),
    @XmlEnumValue("PresetCarDoesntExist")
    PRESET_CAR_DOESNT_EXIST("PresetCarDoesntExist"),
    @XmlEnumValue("InvalidCurrencyType")
    INVALID_CURRENCY_TYPE("InvalidCurrencyType"),
    @XmlEnumValue("WalletDoesntExist")
    WALLET_DOESNT_EXIST("WalletDoesntExist"),
    @XmlEnumValue("InsufficientFunds")
    INSUFFICIENT_FUNDS("InsufficientFunds"),
    @XmlEnumValue("WalletAlreadyExists")
    WALLET_ALREADY_EXISTS("WalletAlreadyExists"),
    @XmlEnumValue("UnsupportedCurrency")
    UNSUPPORTED_CURRENCY("UnsupportedCurrency"),
    @XmlEnumValue("InvalidDebitAmount")
    INVALID_DEBIT_AMOUNT("InvalidDebitAmount"),
    @XmlEnumValue("InvalidCreditAmount")
    INVALID_CREDIT_AMOUNT("InvalidCreditAmount"),
    @XmlEnumValue("InvalidWalletType")
    INVALID_WALLET_TYPE("InvalidWalletType"),
    @XmlEnumValue("WalletNotUserWallet")
    WALLET_NOT_USER_WALLET("WalletNotUserWallet"),
    @XmlEnumValue("InventoryItemDoesntExist")
    INVENTORY_ITEM_DOESNT_EXIST("InventoryItemDoesntExist"),
    @XmlEnumValue("VirtualItemTypeDoesntExist")
    VIRTUAL_ITEM_TYPE_DOESNT_EXIST("VirtualItemTypeDoesntExist"),
    @XmlEnumValue("InsufficientInventory")
    INSUFFICIENT_INVENTORY("InsufficientInventory"),
    @XmlEnumValue("ItemIsForAnotherTier")
    ITEM_IS_FOR_ANOTHER_TIER("ItemIsForAnotherTier"),
    @XmlEnumValue("RecursiveCatalog")
    RECURSIVE_CATALOG("RecursiveCatalog"),
    @XmlEnumValue("InvalidCatalog")
    INVALID_CATALOG("InvalidCatalog"),
    @XmlEnumValue("InvalidBasket")
    INVALID_BASKET("InvalidBasket"),
    @XmlEnumValue("GameIsPrivate")
    GAME_IS_PRIVATE("GameIsPrivate"),
    @XmlEnumValue("GameLocked")
    GAME_LOCKED("GameLocked"),
    @XmlEnumValue("NotInGame")
    NOT_IN_GAME("NotInGame"),
    @XmlEnumValue("NotEnoughSpace")
    NOT_ENOUGH_SPACE("NotEnoughSpace"),
    @XmlEnumValue("GameDoesNotExist")
    GAME_DOES_NOT_EXIST("GameDoesNotExist"),
    @XmlEnumValue("NotPrivateGame")
    NOT_PRIVATE_GAME("NotPrivateGame"),
    @XmlEnumValue("InviteAutoDeclined")
    INVITE_AUTO_DECLINED("InviteAutoDeclined"),
    @XmlEnumValue("MaxStackOrRentalLimitErrorCode")
    MAX_STACK_OR_RENTAL_LIMIT_ERROR_CODE("MaxStackOrRentalLimitErrorCode"),
    @XmlEnumValue("UnspecifiedError")
    UNSPECIFIED_ERROR("UnspecifiedError"),
    @XmlEnumValue("RequiredHeadersNotFound")
    REQUIRED_HEADERS_NOT_FOUND("RequiredHeadersNotFound"),
    @XmlEnumValue("InvalidHeaderValues")
    INVALID_HEADER_VALUES("InvalidHeaderValues"),
    @XmlEnumValue("FailedSessionSecurityPolicy")
    FAILED_SESSION_SECURITY_POLICY("FailedSessionSecurityPolicy"),
    @XmlEnumValue("FailedUserIdComparison")
    FAILED_USER_ID_COMPARISON("FailedUserIdComparison"),
    @XmlEnumValue("FailedPersonaIdComparison")
    FAILED_PERSONA_ID_COMPARISON("FailedPersonaIdComparison"),
    @XmlEnumValue("FailedSessionInsertion")
    FAILED_SESSION_INSERTION("FailedSessionInsertion"),
    @XmlEnumValue("FailedPresenceCheck")
    FAILED_PRESENCE_CHECK("FailedPresenceCheck"),
    @XmlEnumValue("FailedDeleteSession")
    FAILED_DELETE_SESSION("FailedDeleteSession"),
    @XmlEnumValue("FailedUpdateSession")
    FAILED_UPDATE_SESSION("FailedUpdateSession"),
    @XmlEnumValue("FailedReadSession")
    FAILED_READ_SESSION("FailedReadSession"),
    @XmlEnumValue("NoSuchSessionInSessionStore")
    NO_SUCH_SESSION_IN_SESSION_STORE("NoSuchSessionInSessionStore"),
    @XmlEnumValue("InvalidUserId")
    INVALID_USER_ID("InvalidUserId"),
    @XmlEnumValue("InvalidPresence")
    INVALID_PRESENCE("InvalidPresence"),
    @XmlEnumValue("NoSuchInfoValueInSessionCurrentTable")
    NO_SUCH_INFO_VALUE_IN_SESSION_CURRENT_TABLE("NoSuchInfoValueInSessionCurrentTable"),
    @XmlEnumValue("FailedPlayGameEntitlementCheck")
    FAILED_PLAY_GAME_ENTITLEMENT_CHECK("FailedPlayGameEntitlementCheck"),
    @XmlEnumValue("NotPermanentSessionKey")
    NOT_PERMANENT_SESSION_KEY("NotPermanentSessionKey"),
    @XmlEnumValue("WebTokenCheckFailed")
    WEB_TOKEN_CHECK_FAILED("WebTokenCheckFailed"),
    @XmlEnumValue("ConfigFilesAuthenticationException")
    CONFIG_FILES_AUTHENTICATION_EXCEPTION("ConfigFilesAuthenticationException"),
    @XmlEnumValue("LoginFailureLimitReached")
    LOGIN_FAILURE_LIMIT_REACHED("LoginFailureLimitReached"),
    @XmlEnumValue("MaximumUsersLoggedInHardCapReached")
    MAXIMUM_USERS_LOGGED_IN_HARD_CAP_REACHED("MaximumUsersLoggedInHardCapReached"),
    @XmlEnumValue("MaximumUsersLoggedInSoftCapReached")
    MAXIMUM_USERS_LOGGED_IN_SOFT_CAP_REACHED("MaximumUsersLoggedInSoftCapReached"),
    @XmlEnumValue("MaximumUsersLoggedInUnspecified")
    MAXIMUM_USERS_LOGGED_IN_UNSPECIFIED("MaximumUsersLoggedInUnspecified"),
    @XmlEnumValue("SessionRequestThresholdReached")
    SESSION_REQUEST_THRESHOLD_REACHED("SessionRequestThresholdReached"),
    @XmlEnumValue("InvalidEntrantEventSession")
    INVALID_ENTRANT_EVENT_SESSION("InvalidEntrantEventSession"),
    @XmlEnumValue("InvalidFinishReason")
    INVALID_FINISH_REASON("InvalidFinishReason"),
    @XmlEnumValue("InvalidRaceTimeInResult")
    INVALID_RACE_TIME_IN_RESULT("InvalidRaceTimeInResult"),
    @XmlEnumValue("InvalidSpeedInResult")
    INVALID_SPEED_IN_RESULT("InvalidSpeedInResult"),
    @XmlEnumValue("InvalidPlacingInResult")
    INVALID_PLACING_IN_RESULT("InvalidPlacingInResult"),
    @XmlEnumValue("InvalidFractionCompletedInResult")
    INVALID_FRACTION_COMPLETED_IN_RESULT("InvalidFractionCompletedInResult"),
    @XmlEnumValue("InvalidRequestorIdHeader")
    INVALID_REQUESTOR_ID_HEADER("InvalidRequestorIdHeader"),
    @XmlEnumValue("UsernameIsNotAllowed")
    USERNAME_IS_NOT_ALLOWED("UsernameIsNotAllowed"),
    @XmlEnumValue("EmailInvalid")
    EMAIL_INVALID("EmailInvalid"),
    @XmlEnumValue("EmailInvalidDomain")
    EMAIL_INVALID_DOMAIN("EmailInvalidDomain"),
    @XmlEnumValue("EmailMissing")
    EMAIL_MISSING("EmailMissing"),
    @XmlEnumValue("EmailDuplicate")
    EMAIL_DUPLICATE("EmailDuplicate"),
    @XmlEnumValue("PasswordMissing")
    PASSWORD_MISSING("PasswordMissing"),
    @XmlEnumValue("PasswordTooShort")
    PASSWORD_TOO_SHORT("PasswordTooShort"),
    @XmlEnumValue("PasswordTooLong")
    PASSWORD_TOO_LONG("PasswordTooLong"),
    @XmlEnumValue("PasswordNoSpacesAllowed")
    PASSWORD_NO_SPACES_ALLOWED("PasswordNoSpacesAllowed"),
    @XmlEnumValue("PasswordEmailCombinationDuplicate")
    PASSWORD_EMAIL_COMBINATION_DUPLICATE("PasswordEmailCombinationDuplicate"),
    @XmlEnumValue("DateOfBirthMissing")
    DATE_OF_BIRTH_MISSING("DateOfBirthMissing"),
    @XmlEnumValue("DateOfBirthInvalid")
    DATE_OF_BIRTH_INVALID("DateOfBirthInvalid"),
    @XmlEnumValue("DateOfBirthTooYoung")
    DATE_OF_BIRTH_TOO_YOUNG("DateOfBirthTooYoung"),
    @XmlEnumValue("CountryMissing")
    COUNTRY_MISSING("CountryMissing"),
    @XmlEnumValue("CountryInvalid")
    COUNTRY_INVALID("CountryInvalid"),
    @XmlEnumValue("CountryBanned")
    COUNTRY_BANNED("CountryBanned"),
    @XmlEnumValue("LanguageMissing")
    LANGUAGE_MISSING("LanguageMissing"),
    @XmlEnumValue("LanguageInvalid")
    LANGUAGE_INVALID("LanguageInvalid"),
    @XmlEnumValue("TosVersionMissing")
    TOS_VERSION_MISSING("TosVersionMissing"),
    @XmlEnumValue("TosVersionTooLong")
    TOS_VERSION_TOO_LONG("TosVersionTooLong"),
    @XmlEnumValue("StatusMissing")
    STATUS_MISSING("StatusMissing"),
    @XmlEnumValue("StatusInvalid")
    STATUS_INVALID("StatusInvalid"),
    @XmlEnumValue("StatusIllegalValue")
    STATUS_ILLEGAL_VALUE("StatusIllegalValue"),
    @XmlEnumValue("GlobalOptInMissing")
    GLOBAL_OPT_IN_MISSING("GlobalOptInMissing"),
    @XmlEnumValue("GlobalOptInInvalid")
    GLOBAL_OPT_IN_INVALID("GlobalOptInInvalid"),
    @XmlEnumValue("ThirdPartyOptInMissing")
    THIRD_PARTY_OPT_IN_MISSING("ThirdPartyOptInMissing"),
    @XmlEnumValue("ThirdPartyOptInInvalid")
    THIRD_PARTY_OPT_IN_INVALID("ThirdPartyOptInInvalid"),
    @XmlEnumValue("LastAuthenticatedOnDateInvalid")
    LAST_AUTHENTICATED_ON_DATE_INVALID("LastAuthenticatedOnDateInvalid"),
    @XmlEnumValue("RemoteUserDoesNotExist")
    REMOTE_USER_DOES_NOT_EXIST("RemoteUserDoesNotExist"),
    @XmlEnumValue("PasswordIncorrect")
    PASSWORD_INCORRECT("PasswordIncorrect"),
    @XmlEnumValue("RemoteUserIsBanned")
    REMOTE_USER_IS_BANNED("RemoteUserIsBanned"),
    @XmlEnumValue("RegistrationSourceTooLong")
    REGISTRATION_SOURCE_TOO_LONG("RegistrationSourceTooLong"),
    @XmlEnumValue("RemoteUserIsGameBanned")
    REMOTE_USER_IS_GAME_BANNED("RemoteUserIsGameBanned"),
    @XmlEnumValue("RemoteUserIsTempGameBanned")
    REMOTE_USER_IS_TEMP_GAME_BANNED("RemoteUserIsTempGameBanned"),
    @XmlEnumValue("InvalidGenderErrorCode")
    INVALID_GENDER_ERROR_CODE("InvalidGenderErrorCode"),
    @XmlEnumValue("RemoteNamespaceDoesNotExist")
    REMOTE_NAMESPACE_DOES_NOT_EXIST("RemoteNamespaceDoesNotExist"),
    @XmlEnumValue("DisplayNameMissing")
    DISPLAY_NAME_MISSING("DisplayNameMissing"),
    @XmlEnumValue("DisplayNameDuplicate")
    DISPLAY_NAME_DUPLICATE("DisplayNameDuplicate"),
    @XmlEnumValue("DisplayNameTooLong")
    DISPLAY_NAME_TOO_LONG("DisplayNameTooLong"),
    @XmlEnumValue("DisplayNameTooShort")
    DISPLAY_NAME_TOO_SHORT("DisplayNameTooShort"),
    @XmlEnumValue("DisplayNameNotAllowed")
    DISPLAY_NAME_NOT_ALLOWED("DisplayNameNotAllowed"),
    @XmlEnumValue("DisplayNameSuggestionFailed")
    DISPLAY_NAME_SUGGESTION_FAILED("DisplayNameSuggestionFailed"),
    @XmlEnumValue("StatusReasonCodeInvalid")
    STATUS_REASON_CODE_INVALID("StatusReasonCodeInvalid"),
    @XmlEnumValue("LastAuthenticatedDateInvalid")
    LAST_AUTHENTICATED_DATE_INVALID("LastAuthenticatedDateInvalid"),
    @XmlEnumValue("MaximumNumberOfPersonasInNamespaceReached")
    MAXIMUM_NUMBER_OF_PERSONAS_IN_NAMESPACE_REACHED("MaximumNumberOfPersonasInNamespaceReached"),
    @XmlEnumValue("PersonaNotFound")
    PERSONA_NOT_FOUND("PersonaNotFound"),
    @XmlEnumValue("RemotePersonaDoesNotBelongToUser")
    REMOTE_PERSONA_DOES_NOT_BELONG_TO_USER("RemotePersonaDoesNotBelongToUser"),
    @XmlEnumValue("UserNotFound")
    USER_NOT_FOUND("UserNotFound"),
    @XmlEnumValue("MoreThanOneRemoteUserFound")
    MORE_THAN_ONE_REMOTE_USER_FOUND("MoreThanOneRemoteUserFound"),
    @XmlEnumValue("UnableToAuthenticateUserByAuthKey")
    UNABLE_TO_AUTHENTICATE_USER_BY_AUTH_KEY("UnableToAuthenticateUserByAuthKey"),
    @XmlEnumValue("PersonaCarIsNull")
    PERSONA_CAR_IS_NULL("PersonaCarIsNull"),
    @XmlEnumValue("PersonaMottoIsTooLong")
    PERSONA_MOTTO_IS_TOO_LONG("PersonaMottoIsTooLong"),
    @XmlEnumValue("TooManySuggestionsRequested")
    TOO_MANY_SUGGESTIONS_REQUESTED("TooManySuggestionsRequested"),
    @XmlEnumValue("MaximumNumberOfPersonasForUserReached")
    MAXIMUM_NUMBER_OF_PERSONAS_FOR_USER_REACHED("MaximumNumberOfPersonasForUserReached"),
    @XmlEnumValue("WrongClientVersion")
    WRONG_CLIENT_VERSION("WrongClientVersion"),
    @XmlEnumValue("AuthenticationTokenMissing")
    AUTHENTICATION_TOKEN_MISSING("AuthenticationTokenMissing"),
    @XmlEnumValue("TransactionAlreadyActive")
    TRANSACTION_ALREADY_ACTIVE("TransactionAlreadyActive"),
    @XmlEnumValue("FriendIsSelf")
    FRIEND_IS_SELF("FriendIsSelf"),
    @XmlEnumValue("FriendAlreadyAdded")
    FRIEND_ALREADY_ADDED("FriendAlreadyAdded"),
    @XmlEnumValue("FriendDoesNotExist")
    FRIEND_DOES_NOT_EXIST("FriendDoesNotExist"),
    @XmlEnumValue("FriendsListExceededMaximumCount")
    FRIENDS_LIST_EXCEEDED_MAXIMUM_COUNT("FriendsListExceededMaximumCount"),
    @XmlEnumValue("TargetFriendsListExceededMaximumCount")
    TARGET_FRIENDS_LIST_EXCEEDED_MAXIMUM_COUNT("TargetFriendsListExceededMaximumCount"),
    @XmlEnumValue("NullValue")
    NULL_VALUE("NullValue"),
    @XmlEnumValue("LuckyDrawNoTableDefinedForRace")
    LUCKY_DRAW_NO_TABLE_DEFINED_FOR_RACE("LuckyDrawNoTableDefinedForRace"),
    @XmlEnumValue("LuckyDrawInvalidDraw")
    LUCKY_DRAW_INVALID_DRAW("LuckyDrawInvalidDraw"),
    @XmlEnumValue("LuckyDrawNoMoreDraws")
    LUCKY_DRAW_NO_MORE_DRAWS("LuckyDrawNoMoreDraws"),
    @XmlEnumValue("LuckyDrawNoLootTablesNotPopulated")
    LUCKY_DRAW_NO_LOOT_TABLES_NOT_POPULATED("LuckyDrawNoLootTablesNotPopulated"),
    @XmlEnumValue("LuckyDrawCouldNotDrawProduct")
    LUCKY_DRAW_COULD_NOT_DRAW_PRODUCT("LuckyDrawCouldNotDrawProduct"),
    @XmlEnumValue("LuckyDrawCannotDeterminePersonaLevel")
    LUCKY_DRAW_CANNOT_DETERMINE_PERSONA_LEVEL("LuckyDrawCannotDeterminePersonaLevel"),
    @XmlEnumValue("LuckyDrawContextNotFoundOrEmpty")
    LUCKY_DRAW_CONTEXT_NOT_FOUND_OR_EMPTY("LuckyDrawContextNotFoundOrEmpty"),
    @XmlEnumValue("EventNotFound")
    EVENT_NOT_FOUND("EventNotFound"),
    @XmlEnumValue("SuggestiveSalesInvalidContext")
    SUGGESTIVE_SALES_INVALID_CONTEXT("SuggestiveSalesInvalidContext"),
    @XmlEnumValue("SuggestiveSalesInvalidConfiguration")
    SUGGESTIVE_SALES_INVALID_CONFIGURATION("SuggestiveSalesInvalidConfiguration"),
    @XmlEnumValue("SuggestiveSalesCannotDeterminePersonaLevel")
    SUGGESTIVE_SALES_CANNOT_DETERMINE_PERSONA_LEVEL("SuggestiveSalesCannotDeterminePersonaLevel"),
    @XmlEnumValue("MissingRequiredEntitlements")
    MISSING_REQUIRED_ENTITLEMENTS("MissingRequiredEntitlements"),
    @XmlEnumValue("BannedEntitlements")
    BANNED_ENTITLEMENTS("BannedEntitlements"),
    @XmlEnumValue("RemotePersonaIdInvalid")
    REMOTE_PERSONA_ID_INVALID("RemotePersonaIdInvalid"),
    @XmlEnumValue("PlayerNotRanked")
    PLAYER_NOT_RANKED("PlayerNotRanked"),
    @XmlEnumValue("NoWalletErrorCode")
    NO_WALLET_ERROR_CODE("NoWalletErrorCode"),
    @XmlEnumValue("WalletBalanceIsNotEnough")
    WALLET_BALANCE_IS_NOT_ENOUGH("WalletBalanceIsNotEnough"),
    @XmlEnumValue("UserHasNoEntitlements")
    USER_HAS_NO_ENTITLEMENTS("UserHasNoEntitlements"),
    @XmlEnumValue("NotInQueue")
    NOT_IN_QUEUE("NotInQueue"),
    @XmlEnumValue("EntitlementProductIdMissing")
    ENTITLEMENT_PRODUCT_ID_MISSING("EntitlementProductIdMissing"),
    @XmlEnumValue("EntitlementProductIdTooShort")
    ENTITLEMENT_PRODUCT_ID_TOO_SHORT("EntitlementProductIdTooShort"),
    @XmlEnumValue("EntitlementProductIdTooLong")
    ENTITLEMENT_PRODUCT_ID_TOO_LONG("EntitlementProductIdTooLong"),
    @XmlEnumValue("EntitlementTagMissing")
    ENTITLEMENT_TAG_MISSING("EntitlementTagMissing"),
    @XmlEnumValue("EntitlementTagTooShort")
    ENTITLEMENT_TAG_TOO_SHORT("EntitlementTagTooShort"),
    @XmlEnumValue("EntitlementTagTooLong")
    ENTITLEMENT_TAG_TOO_LONG("EntitlementTagTooLong"),
    @XmlEnumValue("EntitlementGrantDateInvalid")
    ENTITLEMENT_GRANT_DATE_INVALID("EntitlementGrantDateInvalid"),
    @XmlEnumValue("EntitlementTerminationDateInvalid")
    ENTITLEMENT_TERMINATION_DATE_INVALID("EntitlementTerminationDateInvalid"),
    @XmlEnumValue("EntitlementNoSuchGroup")
    ENTITLEMENT_NO_SUCH_GROUP("EntitlementNoSuchGroup"),
    @XmlEnumValue("EntitlementConcurrencyFailure")
    ENTITLEMENT_CONCURRENCY_FAILURE("EntitlementConcurrencyFailure"),
    @XmlEnumValue("EntitlementInvalidCount")
    ENTITLEMENT_INVALID_COUNT("EntitlementInvalidCount"),
    @XmlEnumValue("NoProductErrorCode")
    NO_PRODUCT_ERROR_CODE("NoProductErrorCode"),
    @XmlEnumValue("NoPricepointErrorCode")
    NO_PRICEPOINT_ERROR_CODE("NoPricepointErrorCode"),
    @XmlEnumValue("MoreThanOneRemotePersonaFound")
    MORE_THAN_ONE_REMOTE_PERSONA_FOUND("MoreThanOneRemotePersonaFound"),
    @XmlEnumValue("ServerConfigNotFound")
    SERVER_CONFIG_NOT_FOUND("ServerConfigNotFound"),
    @XmlEnumValue("NoSuchEntitlementExists")
    NO_SUCH_ENTITLEMENT_EXISTS("NoSuchEntitlementExists"),
    @XmlEnumValue("SessionKeyRequiredButNotFound")
    SESSION_KEY_REQUIRED_BUT_NOT_FOUND("SessionKeyRequiredButNotFound"),
    @XmlEnumValue("InvalidRewardModeForTelemetry")
    INVALID_REWARD_MODE_FOR_TELEMETRY("InvalidRewardModeForTelemetry"),
    @XmlEnumValue("SocialFriendRequestNotResolvable")
    SOCIAL_FRIEND_REQUEST_NOT_RESOLVABLE("SocialFriendRequestNotResolvable"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("RemoteAccountManagementTimeout")
    REMOTE_ACCOUNT_MANAGEMENT_TIMEOUT("RemoteAccountManagementTimeout"),
    @XmlEnumValue("VoipRemoteCallTimeout")
    VOIP_REMOTE_CALL_TIMEOUT("VoipRemoteCallTimeout"),
    @XmlEnumValue("VoipUnknownError")
    VOIP_UNKNOWN_ERROR("VoipUnknownError"),
    @XmlEnumValue("LiveUpdateAuthenticationFailed")
    LIVE_UPDATE_AUTHENTICATION_FAILED("LiveUpdateAuthenticationFailed"),
    @XmlEnumValue("LiveUpdateInvalidCatalogVersion")
    LIVE_UPDATE_INVALID_CATALOG_VERSION("LiveUpdateInvalidCatalogVersion"),
    @XmlEnumValue("SecurityKickedArbitration")
    SECURITY_KICKED_ARBITRATION("SecurityKickedArbitration"),
    @XmlEnumValue("SecurityKickedRaceTime")
    SECURITY_KICKED_RACE_TIME("SecurityKickedRaceTime"),
    @XmlEnumValue("SecurityKickedRaceTimeRatio")
    SECURITY_KICKED_RACE_TIME_RATIO("SecurityKickedRaceTimeRatio"),
    @XmlEnumValue("SecurityKickedStatisticalRaceTime")
    SECURITY_KICKED_STATISTICAL_RACE_TIME("SecurityKickedStatisticalRaceTime"),
    @XmlEnumValue("SecurityKickedStatisticalTopSpeed")
    SECURITY_KICKED_STATISTICAL_TOP_SPEED("SecurityKickedStatisticalTopSpeed"),
    @XmlEnumValue("SecurityKickedInvalidPowerup")
    SECURITY_KICKED_INVALID_POWERUP("SecurityKickedInvalidPowerup");
    private final String value;

    EngineErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EngineErrorCode fromValue(String v) {
        for (EngineErrorCode c: EngineErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

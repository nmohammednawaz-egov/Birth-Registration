//package digit.web.models;
//
//import java.util.Objects;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonCreator;
//import digit.web.models.Role;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.validation.annotation.Validated;
//import javax.validation.Valid;
//import javax.validation.constraints.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.Builder;
//
///**
// * User
// */
//@Validated
//@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2024-01-06T20:09:14.891+05:30")
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class User   {
//
//        @JsonProperty("id")
//        private String id = null;
//
//        @JsonProperty("userName")
//        private String userName = null;
//
//        @JsonProperty("password")
//        private String password = null;
//
//        @JsonProperty("salutation")
//        private String salutation = null;
//
//        @JsonProperty("name")
//        private String name = null;
//
//        @JsonProperty("gender")
//        private String gender = null;
//
//        @JsonProperty("mobileNumber")
//        private String mobileNumber = null;
//
//        @JsonProperty("emailId")
//        private String emailId = null;
//
//        @JsonProperty("altContactNumber")
//        private String altContactNumber = null;
//
//        @JsonProperty("pan")
//        private String pan = null;
//
//        @JsonProperty("aadhaarNumber")
//        private String aadhaarNumber = null;
//
//        @JsonProperty("permanentAddress")
//        private String permanentAddress = null;
//
//        @JsonProperty("permanentCity")
//        private String permanentCity = null;
//
//        @JsonProperty("permanentPincode")
//        private String permanentPincode = null;
//
//        @JsonProperty("correspondenceCity")
//        private String correspondenceCity = null;
//
//        @JsonProperty("correspondencePincode")
//        private String correspondencePincode = null;
//
//        @JsonProperty("correspondenceAddress")
//        private String correspondenceAddress = null;
//
//        @JsonProperty("active")
//        private Boolean active = null;
//
//        @JsonProperty("locale")
//        private String locale = null;
//
//        @JsonProperty("type")
//        private String type = null;
//
//        @JsonProperty("accountLocked")
//        private Boolean accountLocked = null;
//
//        @JsonProperty("accountLockedDate")
//        private Long accountLockedDate = null;
//
//        @JsonProperty("fatherOrHusbandName")
//        private String fatherOrHusbandName = null;
//
//        @JsonProperty("relationship")
//        private String relationship = null;
//
//        @JsonProperty("signature")
//        private String signature = null;
//
//        @JsonProperty("bloodGroup")
//        private String bloodGroup = null;
//
//        @JsonProperty("photo")
//        private String photo = null;
//
//        @JsonProperty("identificationMark")
//        private String identificationMark = null;
//
//        @JsonProperty("createdBy")
//        private Long createdBy = null;
//
//        @JsonProperty("lastModifiedBy")
//        private Long lastModifiedBy = null;
//
//        @JsonProperty("tenantId")
//        private String tenantId = null;
//
//        @JsonProperty("roles")
//        @Valid
//        private List<Role> roles = null;
//
//        @JsonProperty("uuid")
//        private String uuid = null;
//
//        @JsonProperty("createdDate")
//        private LocalDate createdDate = null;
//
//        @JsonProperty("lastModifiedDate")
//        private LocalDate lastModifiedDate = null;
//
//        @JsonProperty("otpReference")
//        private String otpReference = null;
//
//        @JsonProperty("dob")
//        private LocalDate dob = null;
//
//        @JsonProperty("pwdExpiryDate")
//        private LocalDate pwdExpiryDate = null;
//
//
//        public User addRolesItem(Role rolesItem) {
//            if (this.roles == null) {
//            this.roles = new ArrayList<>();
//            }
//        this.roles.add(rolesItem);
//        return this;
//        }
//
//}
//
package digit.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2022-08-16T15:34:24.436+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
        @JsonProperty("id")
        private String id = null;

        @JsonProperty("uuid")
        private String uuid = null;

        @JsonProperty("userName")
        private String userName = null;

        @JsonProperty("password")
        private String password = null;

        @JsonProperty("salutation")
        private String salutation = null;

        @JsonProperty("name")
        private String name = null;

        @JsonProperty("gender")
        private String gender = null;

        @JsonProperty("mobileNumber")
        private String mobileNumber = null;

        @JsonProperty("emailId")
        private String emailId = null;

        @JsonProperty("altContactNumber")
        private String altContactNumber = null;

        @JsonProperty("pan")
        private String pan = null;

        @JsonProperty("aadhaarNumber")
        private String aadhaarNumber = null;

        @JsonProperty("permanentAddress")
        private String permanentAddress = null;

        @JsonProperty("permanentCity")
        private String permanentCity = null;

        @JsonProperty("permanentPincode")
        private String permanentPincode = null;


        @JsonProperty("roles")
        @Valid
        private List<Role> roles = null;@JsonProperty("correspondenceCity")
        private String correspondenceCity = null;

        @JsonProperty("correspondencePincode")
        private String correspondencePincode = null;

        @JsonProperty("correspondenceAddress")
        private String correspondenceAddress = null;

        @JsonProperty("active")
        private Boolean active = null;

        @JsonProperty("locale")
        private String locale = null;

        @JsonProperty("type")
        private String type = null;

        @JsonProperty("signature")
        private String signature = null;

        @JsonProperty("accountLocked")
        private Boolean accountLocked = null;

        @JsonProperty("fatherOrHusbandName")
        private String fatherOrHusbandName = null;

        @JsonProperty("bloodGroup")
        private String bloodGroup = null;

        @JsonProperty("identificationMark")
        private String identificationMark = null;

        @JsonProperty("photo")
        private String photo = null;

        @JsonProperty("createdBy")
        private Long createdBy = null;

        @JsonProperty("lastModifiedBy")
        private Long lastModifiedBy = null;

        @JsonProperty("otpReference")
        private String otpReference = null;

        @JsonProperty("tenantId")
        private String tenantId = null;


        public User addRolesItem(Role rolesItem) {
                if (this.roles == null) {
                        this.roles = new ArrayList<>();
                }
                this.roles.add(rolesItem);
                return this;
        }

}

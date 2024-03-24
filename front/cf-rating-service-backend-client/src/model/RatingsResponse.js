/**
 * OpenAPI cf-rating-service
 * cf-rating-service API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Rating from './Rating';

/**
 * The RatingsResponse model module.
 * @module model/RatingsResponse
 * @version 1.0.0
 */
class RatingsResponse {
    /**
     * Constructs a new <code>RatingsResponse</code>.
     * @alias module:model/RatingsResponse
     */
    constructor() { 
        
        RatingsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RatingsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RatingsResponse} obj Optional instance to populate.
     * @return {module:model/RatingsResponse} The populated <code>RatingsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RatingsResponse();

            if (data.hasOwnProperty('ratings')) {
                obj['ratings'] = ApiClient.convertToType(data['ratings'], [Rating]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RatingsResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RatingsResponse</code>.
     */
    static validateJSON(data) {
        if (data['ratings']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['ratings'])) {
                throw new Error("Expected the field `ratings` to be an array in the JSON data but got " + data['ratings']);
            }
            // validate the optional field `ratings` (array)
            for (const item of data['ratings']) {
                Rating.validateJSON(item);
            };
        }

        return true;
    }


}



/**
 * @member {Array.<module:model/Rating>} ratings
 */
RatingsResponse.prototype['ratings'] = undefined;






export default RatingsResponse;


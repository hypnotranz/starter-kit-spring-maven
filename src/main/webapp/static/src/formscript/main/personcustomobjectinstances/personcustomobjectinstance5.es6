import FormScript from 'formscript';

export default class PersonCustomObjectInstance5 extends FormScript {

    run(callback) {
        let promises = [];

        this.whenAjaxDone(promises, callback);
    }

}
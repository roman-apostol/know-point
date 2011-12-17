package know.point

class CalTestController {

    def index() { }
    def week(){
        [ date:new Date(), readOnly:false ];
    }
    def day(){
        [ date:new Date(), readOnly:false ];
    }

}

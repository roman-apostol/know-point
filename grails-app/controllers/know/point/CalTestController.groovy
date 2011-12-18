package know.point

class CalTestController {

    def index() { }
    def week(){
        def itemList = []
        [ date:new Date(), readOnly:true ];
    }
    def day(){
        [ date:new Date(), readOnly:false ];
    }


}

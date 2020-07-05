#[macro_use]
extern crate hello_world_derive;

trait THelloWorld {
    fn hello();
}

#[derive(HelloWorld)]
struct FrenchToast;

//impl HelloWorld for FrenchToast {
    //fn hello() {
        //println!("Hello!");
    //}
//}

fn main() {
    FrenchToast::hello();
}

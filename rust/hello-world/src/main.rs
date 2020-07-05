#[macro_use]
extern crate hello_world_derive;

trait THelloWorld {
    fn hello();
}

#[derive(HelloWorld)]
struct FrenchToast;

fn main() {
    FrenchToast::hello();
}

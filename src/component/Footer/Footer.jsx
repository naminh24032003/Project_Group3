import React from 'react'
import { Container, Row, Col, Stack, Image, Nav, NavLink } from 'react-bootstrap';
import '../Footer/Footer.css'
import 'bootstrap/dist/css/bootstrap.min.css'
function Footer() {
    return (
        <div className='footer'>
            <Container fluid>
                <Row className='mt-auto border border-dark '>
                    <Col className='d-flex align-items-center justify-content-center'>
                        <Image 
                            src='/src/assets/diamond-svgrepo-com.svg'
                            
                            alt=''
                            width='60'
                            height='60'
                        />
                    </Col>
                    <Col className='my-4' >
                        Feature
                        <Stack>
                            <NavLink>Price Calculate</NavLink>
                            <NavLink>Check Diamond</NavLink>
                        </Stack>
                    </Col>
                    <Col className='my-4' >
                        Price
                        <Stack>
                            <NavLink>Diamond Price</NavLink>
                            <NavLink>0.3 Carat</NavLink>
                            <NavLink>1.0 Carat</NavLink>
                            <NavLink>2.0 Carat</NavLink>
                        </Stack>
                    </Col>
                    <Col className='my-4' >
                        More
                        <Stack>
                            <NavLink>Blog</NavLink>
                            <NavLink>Service</NavLink>
                            <NavLink>Partner</NavLink>
                        </Stack>
                    </Col>
                    <Col className='my-4' >
                        <div>
                        About Us
                        <NavLink>Our Story</NavLink>
                        <NavLink>Work with us</NavLink>
                        </div>

                    </Col>
                    <Col className='my-4'>
                        <div className='text-center'>Contact Us</div>
                        <Nav className='justify-content-center'>
                        <NavLink href='' className='p-2'>
                        <img
                            src='/src/assets/instagram.svg'
                            alt=''
                            width='15'
                            height='15'
                        />
                        </NavLink>
                        <NavLink href='' className='p-2'>
                        <img
                            src='/src/assets/facebook.svg'
                            alt=''
                            width='15'
                            height='15'
                        />
                        </NavLink>
                        <NavLink href='' className='p-2'>
                        <img
                            src='/src/assets/youtube.svg'
                            alt=''
                            width='15'
                            height='15'
                        />
                        </NavLink>
                        <NavLink href='' className='p-2'>
                        <img
                            src='/src/assets/pinterest.svg'
                            alt=''
                            width='15'
                            height='15'
                        />
                        </NavLink>
                        <NavLink href='' className='p-2'>
                        <img
                            src='/src/assets/tiktok.svg'
                            alt=''
                            width='15'
                            height='15'
                        />
                        </NavLink>
                        </Nav>
                    </Col>
                </Row>
            </Container>
        </div>



    )
}
export default Footer